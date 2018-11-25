grammar PostHtml;

@header {
import posthtml.posthtml.*;
}

init returns [String result]
    : d1=draw        {$result = $d1.result;}
    ;

draw returns [String result]
    :begin
     b1=block 
     end                {$result = $b1.result;}
    ;

begin returns [String result]
    : b1 = BEGIN        {$result = $b1.text;}
    ;

end returns [String result]
    : e1 = END          {$result = $e1.text}
    ;

block returns [String result]
    :{$result = "bloco;";}
    p1 = property      {$result = $result + $p1.result+"; \n";}
    (s1 = shape         {$result = $result + $s1.result+"\n"})*
    ;

shape returns [String result]
    : t1 = type         {$result = $t1.result+";";}
    ;

type returns [String result]
    :(
        SQUARE                  {$result = SQUARE.text+";";}
        | RECTANGLE             {$result = $RECTANGLE.text+";";}
        | OVAL                  {$result = $OVAL.text+";";} 
        | STAR                  {$result = $STAR.text+";";}
        | PENTAGON              {$result = $PENTAGON.text+";";}
        | HEXAGON               {$result = $HEXAGON.text+";";} 
        | OCTAGON               {$result = $OCTAGON.text+";";} 
        | HEART                 {$result = $HEART.text+";";}
        | INFINITE              {$result = $INFINITE.text+";";} 
        | DIAMOND               {$result = $DIAMOND.text+";";} 
        | YINYANG               {$result = $YINYANG.text+";";} 
        | CIRCLE                {$result = $CIRCLE.text+";";}
        | TRIANGLE              {$result = $TRIANGLE.text+";";} 
        | TRAPEZIO              {$result = $TRAPEZIO.text+";";} 
        | PARALLELOGRAM         {$result = $PARALLELOGRAM.text+";";}
    )
    p1 = property      {$result = $result + $p1.result;}
    ;

property returns [String result]
    : a1 = height       {$result = $a1.result;}
      l1 = width      {$result = $result + $l1.result;}
      c1 = color          {$result = $result + $c1.result;}
    ;

color returns [String result]
    :(
        RED        {$result = "background-color:#FF0000";}
        | BLUE          {$result = "background-color:#0000FF";}
        | BLACK         {$result = "background-color:#000000";}
        | PURPLE          {$result = "background-color:#A020F0";}
        | YELLOW       {$result = "background-color:#FFFF00";} 
        | PINK          {$result = "background-color:#EE49EE";} 
        | GREEN         {$result = "background-color:#228B22";} 
        | WHITE        {$result = "background-color:#ffffff";}
     )
    ;

height returns [String result]
    : n1 = number       {$result = "height:"+$n1.result+";";}
    ;

width returns [String result]
    : n1 = number       {$result = "width:"+$n1.result+";";}
    ;

side returns [String result]
    : n1 = number       {$result = "side:"+$n1.result+";";}
    ;

number returns [String result]
    : INTEGER {$result = $INTEGER.text;}
    ;


BEGIN: 'begin';
END: 'end';
fragment DIGIT  : [0-9] ;
INTEGER: [0-9]+;

SQUARE: 'square';
RECTANGLE: 'rectangle';
OVAL: 'oval';
STAR: 'star';
PENTAGON: 'pentagon';
HEXAGON: 'hexagon';
OCTAGON: 'octagon';
HEART: 'heart';
INFINITE: 'infinite';
DIAMOND: 'diamond';
YINYANG: 'yinyang';
CIRCLE: 'CIRCLE';
TRIANGLE: 'triangle';
TRAPEZIO: 'trapezio';
PARALLELOGRAM: 'parallelogram';

RED: 'red';
BLUE: 'blue';
BLACK: 'black';
PURPLE: 'purple';
WHITE: 'white';
GREEN: 'green';
PINK : 'pink';
YELLOW: 'yellow';

WS      : [ \t\r\n]+ -> skip ;
