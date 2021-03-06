grammar DrawScript;

@header {
import workload.Expr;
import workload.Sketch;
import workload.Operator;
import static workload.Expr.*;
import static workload.Sketch.*;
import workload.Op;
import java.util.LinkedList;
}

/* A forma de definir uma "unidade de execução" foi alterada. Uma unidade de 
 * execução passa a ser uma sequência de "statements" ("declaração" ou 
 * "afirmação" em português).
 */
inicio returns [List<Expr> result]
@init{
    $result = new LinkedList<>();
}
    : (s=statement  {$result.add($s.result);})*
    ;

/* Um statement é definido de modo semelhante à definição de statement em C++ 
 * [[http://www.nongnu.org/hcb/#statement]], porém com a diferença de que 
 * nossos statements retornam valores.
 */
statement returns [Expr result]
    : e=expr SEMI           {$result = $e.result;}
    | a=assign SEMI         {$result = $a.result;}
    | f=createFunc          {$result = $f.result;}
    | i=ifExpr              {$result = $i.result;}
    | w=whileExpr           {$result = $w.result;}
    | b=block               {$result = $b.result;}
    ;

createFunc returns [Expr result]
    : KEYCREATEF IDENT LPAR a = argList RPAR block  {$result = mkFunction($IDENT.text, $block.result, $a.args);}
    ;
ifExpr returns [Expr result]
    : IF c=bexpr THEN t=statement
      {$result = mkIf($c.result, $t.result);}
    | IF c=bexpr THEN t=statement ELSE e=statement
      {$result = mkIf($c.result, $t.result, $e.result);}
    ;

whileExpr returns [Expr result]
    : WHILE c=bexpr DO d=statement
      {$result = mkWhile($c.result, $d.result);}
    ;

block returns [Expr result]
    : LBRC st=sttmtSeq RBRC      {$result = mkBlock($st.sttmts);}
    ;

sttmtSeq returns [List<Expr> sttmts]
@init {
    $sttmts = new LinkedList<>();
}
    : (s1=statement {$sttmts.add($s1.result);})*
    ;

expr returns [Expr result]
    : e=bexpr           {$result = $e.result;}
    | RETURN r=bexpr    {$result = mkReturn($r.result);}
    ;

assign returns [Expr result]
    : IDENT GETS e=expr     {$result = mkAssign($IDENT.text, $e.result);}
    | DRAWID IDENT GETS d1 = design       {$result = mkDrawAssing($IDENT.text,$d1.result);} /*declara variavel*/
    ;

bexpr returns [Expr result]
    : d1=disj       {$result = $d1.result;}
      (OR d2=disj   {$result = mkComposite(Op.OR, $result, $d2.result);})*
    ;

disj returns [Expr result]
    : c1=conj      {$result = $c1.result;}
      (AND c2=conj {$result = mkComposite(Op.AND, $result, $c2.result);})*
    ;

conj returns [Expr result]
    : a1=aexpr          {$result = $a1.result;}
      (o=relOp a2=aexpr {$result = mkComposite($o.result, $result, $a2.result);})?
    ;

relOp returns [Operator result]
    : EQU   {$result = Op.EQU;}
    | NEQ   {$result = Op.NEQ;}
    | LT    {$result = Op.LT;}
    | LEQ   {$result = Op.LEQ;}
    | GT    {$result = Op.GT;}
    | GEQ   {$result = Op.GEQ;}
    ;

aexpr returns [Expr result]
    : p1=parcela {$result = $p1.result;}
      ( PLUS p2=parcela  {$result = mkComposite(Op.PLUS, $result, $p2.result);}
      | MINUS p2=parcela {$result = mkComposite(Op.MINUS, $result, $p2.result);}
      )*      
    ;

parcela returns [Expr result]
    : f1=fator  {$result = $f1.result;}
      ( TIMES f2=fator  {$result = mkComposite(Op.TIMES, $result, $f2.result);}
      | DIVIDE f2=fator {$result = mkComposite(Op.DIVIDE, $result, $f2.result);}
      | MOD f2=fator    {$result = mkComposite(Op.MOD, $result, $f2.result);}
      )*
    ;

fator returns [Expr result]
    : t1=termo  {$result = $t1.result;}
      ( EXP t2=termo {$result = mkComposite(Op.EXP, $result, $t2.result);} )?
    ;

termo returns [Expr result]
    : MINUS t1=termo    {$result = mkComposite(Op.UMINUS, $t1.result);}
    | NOT t1=termo      {$result = mkComposite(Op.NOT, $t1.result);}
    | LPAR e1=expr RPAR {$result = $e1.result;}
    | NUMERO            {$result = mkNumeric(Double.parseDouble($NUMERO.text));}
    | IDENT             {$result = mkVar($IDENT.text);}
    | IDENT LPAR a=argList RPAR 
      {$result = mkFunCall($IDENT.text, $a.args);}
    ;

argList returns [List<Expr> args]
@init {
    $args = new LinkedList<Expr>();
}
    : /* vazio */
    | e1=expr        {$args.add($e1.result);}
      (COMMA e2=expr {$args.add($e2.result);})*
    ;

design returns [Sketch result]:
    ds1=shape dp1=property                  {$result = mkDesign($ds1.result,$dp1.result);}
    ;

/*  ============================================================================
*   |USADO PARA DEFINIR QUAL FORMATO DEVE SER CRIADO, APENAS EH ATRIBUIDO UMA   |
*   |STRING, O PROCESSO DE FATO ACONTECE EM DESIGN                              |
    ============================================================================
*/
shape returns[Sketch result]
    : SQUARE {$result = mkShape($SQUARE.text);}
    | RECTANGLE {$result = mkShape($RECTANGLE.text);}
    | OVAL {$result = mkShape($OVAL.text);}
    | PENTAGON {$result = mkShape($PENTAGON.text);}
    | OCTAGON {$result = mkShape($OCTAGON.text);}
    | CIRCLE {$result = mkShape($CIRCLE.text);}
    | TRIANGLE {$result = mkShape($TRIANGLE.text);}
    | TRAPEZIO {$result = mkShape($TRAPEZIO.text);}
    ;

property returns[Sketch result]
    : height = expr pColor = color              {$result = mkProperty($height.result,$pColor.result);}//USADO PARA FORMAS QUE NECESSITAM DE APENAS UM PARAMETRO (CIRCLE E SQUARE)
    | height = expr width = expr pColor = color {$result = mkProperty($height.result,$width.result,$pColor.result);}
    ;

color returns[Sketch result]
    : RED       {$result = mkColor($RED.text);}
    | BLUE      {$result = mkColor($BLUE.text);}
    | BLACK     {$result = mkColor($BLACK.text);}
    | PURPLE    {$result = mkColor($PURPLE.text);}
    | YELLOW    {$result = mkColor($YELLOW.text);}
    | PINK      {$result = mkColor($PINK.text);}
    | GREEN     {$result = mkColor($GREEN.text);}
    | WHITE     {$result = mkColor($WHITE.text);}
    | HEXCOLOR {$result = mkColor($HEXCOLOR.text);}
    ;
fragment DIGITS : [0-9]+;
fragment ALPHA  : [a-zA-Z]+;

NUMERO  : DIGITS ('.' DIGITS)?  ;

//LOGICAL OPERATORS, SELECT STRUCTURES, AND REPEAT STRUCTURE
OR      : 'or'      ;
AND     : 'and'     ;
NOT     : 'not'     ;
IF      : 'if'      ;
THEN    : 'then'    ;
ELSE    : 'else'    ;
WHILE   : 'while'   ;
DO      : 'do'      ;
RETURN  : 'return'  ;

//SHAPES
SQUARE      : 'square'      ;
RECTANGLE   : 'rectangle'   ;
OVAL        : 'oval'        ;
PENTAGON    : 'pentagon'    ;
OCTAGON     : 'octagon'     ;
CIRCLE      : 'circle'      ;
TRIANGLE    : 'triangle'    ;
TRAPEZIO    : 'trapezio'    ;

//COLORS
RED     : 'red'     ;
BLUE    : 'blue'    ;
BLACK   : 'black'   ;
PURPLE  : 'purple'  ;
WHITE   : 'white'   ;
GREEN   : 'green'   ;
PINK    : 'pink'    ;
YELLOW  : 'yellow'  ;

//SKETCH IDENTIFIER, FUNCTION DEFINITION, VARIABLE NAME, AND COLOR
DRAWID      : 'skt';
KEYCREATEF  : 'def';
IDENT       : ALPHA (ALPHA | '_' | DIGITS)*;
HEXCOLOR    : HASH  (ALPHA | DIGITS)+;

//GENERAL TOKEN (MATHEMATICAL SYMBOLS, STATEMENT MARKERS)
HASH    :   '#';
GETS    :   '=';
PLUS    :   '+';
MINUS   :   '-';
TIMES   :   '*';
DIVIDE  :   '/';
MOD     :   '%';
EXP     :   '^';
LPAR    :   '(';
RPAR    :   ')';
LBRC    :   '{';
RBRC    :   '}';
COMMA   :   ',';
SEMI    :   ';';

//LOGICAL-MATHEMATICAL OPERATORS
EQU :   '===';
NEQ :   '!==';
LT  :   '<' ;
LEQ :   '<=';
GT  :   '>' ;
GEQ :   '>=';

//SPACING CHARACTERS AND COMMENT IDENTIFIER
WS      : [ \t\r\n]+    -> skip;
COMMENT : '//' (~'\n')* -> skip;