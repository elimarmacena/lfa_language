grammar PostHtml;

@header {
import posthtml.workload.*;
import static posthtml.workload.*;
}

init returns [Sketch result]
    : d1=draw        {$result = $d1.result;}
    ;

draw returns [Sketch result]
    :begin
     b1=block 
     end                {$result = $b1.result;}
    ;

begin returns [Sketch result]
    : b1 = BEGIN        {$result = $b1.text;}
    ;

end returns [Sketch result]
    : e1 = END          {$result = $e1.text}
    ;

block returns [Sketch result]
    :p1 = property      {$result = $result + $p1.result;}
    (s1 = shape         {$result = $result + $s1.result;})*
    ;

shape returns [Sketch result]
    : t1 = type         {$result = $t1.result+";";}
    ;

type returns [Sketch result]
    :(
        SQUARE                  {$result = mkShape($SQUARE.text+;}
        | RECTANGLE             {$result = $RECTANGLE.text+;}
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

property returns [Sketch result]
    : a1 = height      
      l1 = width      
      c1 = color          {$result = ;}
    ;

color returns [Sketch result]
    :(
        RED                 {$result = mkColor($RED.text);}
        | BLUE              {$result = mkColor($BLUE.text);}
        | BLACK             {$result = mkColor($BLACK.text);}
        | PURPLE            {$result = mkColor($PURPLE.text);}
        | YELLOW            {$result = mkColor($YELLOW.text);} 
        | PINK              {$result = mkColor($PINK.text);} 
        | GREEN             {$result = mkColor($GREEN.text);} 
        | WHITE             {$result = mkColor($WHITE.text);}
     )
    ;

height returns [Sketch result]
    : h1 = number       {$result = $h1.result;}
    ;

width returns [Sketch result]
    : y1 = number       {$result = $y1.result;}
    ;

number returns [Sketch result]
    : INTEGER           {$result = mkNumber(Integer.parseInt($INTEGER.text));}
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
