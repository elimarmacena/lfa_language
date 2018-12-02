grammar PostHtml;

@header {
import posthtml.workload.*;
import static posthtml.workload.*;
import java.util.LinkedList;
}

init returns [Sketch result]: 
    s1 = statement                                  {$result = $s1.result;}
    ;

statement returns [Sketch result]:
     sa1 = drawassing                               {$result = $sa1.result;}
    | d2 = draw                                     {$result = $d2.result;} /*chamada unica do desenho*/
    ;

drawassing returns [Sketch result]:
    DRAWID IDENTITY GETS d1 = draw SEMICOLON       {$result = mkDrawAssing($IDENTITY.text,$d1.result;} /*declara variavel*/
    ;

draw returns[Sketch result]:
	 dd1 = design                               {$result = $dd1.result;}
    ;


design returns[Sketch result]:
	ds1 = shape dp1 = property                  {$result = mkDesing($ds1.result,$dp1.result;}
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
        | PAGE {$result = mkShape($PAGE.text);}
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


DRAWID: 'skt' | 'SKT';
IDENTITY: [_a-zA-Z][_a-zA-Z0-9]*;
BEGIN: 'begin';
END: 'end';
fragment DIGIT: [0-9];
INTEGER: DIGIT+;
SEMICOLON: ';';
GETS: '=';

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
PAGE: 'page';

RED: 'red';
BLUE: 'blue';
BLACK: 'black';
PURPLE: 'purple';
WHITE: 'white';
GREEN: 'green';
PINK: 'pink';
YELLOW: 'yellow';

WS: [ \t\r\n]+ -> skip;
