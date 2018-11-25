grammar PostHtml;

@header {
import posthtml.workload.*;
import static posthtml.workload.*;
import java.util.LinkedList;
}

init returns[Sketch result]: 
    d1 = draw {$result = $d1.result;}
    ;

draw returns[Sketch result]:
	BEGIN b1 = block END {$result = $b1.result;}
    ;

block returns[List<Sketch> result]
@init {
  $result = new LinkedList<Sketch>();
}
    : 
    ( 
        bd = design {$result.add($bd.result);} 
        SEMICOLON
    )+
    ;

design returns[Sketch result]:
	ds1 = shape 
    dp1 = property 
    {$result = mkDesing($ds1.result,$dp1.result;}
    ;

shape returns[Sketch result]: 
    t1 = type {$result = $t1.result;}
    ;

type returns[Sketch result]:
	SQUARE {$result = mkShape($SQUARE.text);}
	| RECTANGLE {$result = mkShape($RECTANGLE.text);}
	| OVAL {$result = mkShape($OVAL.text);}
	| STAR {$result = mkShape($STAR.text);}
	| PENTAGON {$result = mkShape($PENTAGON.text);}
	| HEXAGON {$result = mkShape($HEXAGON.text);}
	| OCTAGON {$result = mkShape($OCTAGON.text);}
	| HEART {$result = mkShape($HEART.text);}
	| CIRCLE {$result = mkShape($CIRCLE.text);}
	| TRIANGLE {$result = mkShape($TRIANGLE.text);}
	| TRAPEZIO {$result = mkShape($TRAPEZIO.text);}
    ;

property returns[Sketch result]:
	ph1 = height 
    wp1 = width 
    pc1 = color 
    {$result = mkProperty($ph1.result,$wp1.result,$pc1.result);}
    ;

color returns[Sketch result]:
	RED {$result = mkColor($RED.text);}
	| BLUE {$result = mkColor($BLUE.text);}
	| BLACK {$result = mkColor($BLACK.text);}
	| PURPLE {$result = mkColor($PURPLE.text);}
	| YELLOW {$result = mkColor($YELLOW.text);}
	| PINK {$result = mkColor($PINK.text);}
	| GREEN {$result = mkColor($GREEN.text);}
	| WHITE {$result = mkColor($WHITE.text);}
    ;

height returns[Sketch result]:
	nh1 = number {$result = $nh1.result;}
    ;

width returns[Sketch result]:
	wn1 = number {$result = $wn1.result;}
    ;

number returns[Sketch result]:
	INTEGER {$result = mkNumber(Integer.parseInt($INTEGER.text));}
    ;

BEGIN: 'begin';
END: 'end';
fragment DIGIT: [0-9];
INTEGER: DIGIT+;
SEMICOLON: ';';

SQUARE: 'square';
RECTANGLE: 'rectangle';
OVAL: 'oval';
STAR: 'star';
PENTAGON: 'pentagon';
HEXAGON: 'hexagon';
OCTAGON: 'octagon';
HEART: 'heart';
CIRCLE: 'CIRCLE';
TRIANGLE: 'triangle';
TRAPEZIO: 'trapezio';

RED: 'red';
BLUE: 'blue';
BLACK: 'black';
PURPLE: 'purple';
WHITE: 'white';
GREEN: 'green';
PINK: 'pink';
YELLOW: 'yellow';

WS: [ \t\r\n]+ -> skip;
