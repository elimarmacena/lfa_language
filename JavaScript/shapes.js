
//CIRCULO
var canvas = document.getElementById('myCanvas');
var ctx = canvas.getContext('2d');
var circle = new Path2D();
circle.moveTo(125, 35);
circle.arc(30, 30, 10, 0, 2 * Math.PI); //(X DO CENTRO, Y DO CENTRO, DIAMETRO DO CIRCULO)
ctx.fill(circle);

//QUADRADO
var altura = 50;
var largura = altura;
var ctx = canvas.getContext('2d');
var rectangle = new Path2D();
rectangle.rect(10, 10, largura, altura); //(X DA PONTA SUPERIOR ESQUERDA,Y DA PONTA SUPERIOR ESQUERDA, ALTURA,LARGURA)
ctx.fill(rectangle);

//RETANGULO
var altura = 30;
var largura = 50;
var ctx = canvas.getContext('2d');
var rectangle = new Path2D();
rectangle.rect(10, 10, largura, altura); //(X DA PONTA SUPERIOR ESQUERDA,Y DA PONTA SUPERIOR ESQUERDA, ALTURA,LARGURA)
ctx.fill(rectangle);

//TRIANGULO
var ctx = canvas.getContext('2d');
ctx.beginPath();
var startPlotY = 100; 
var startPlotX = 200;
var alturaPlot = 100 + startPlotY; //100 NESSE CASO REPRESENTA A ALTURA QUE O USUARIO INFORMOU
var larguraPlot = (startPlotX / 2) + (200 / 2); //200 NESSE CASO REPRESENTA A LARGURA QUE O USUARIO INFORMOU
ctx.moveTo(startPlotX, startPlotY); //ONDE O DESENHO DEVE COMEÇAR
ctx.lineTo((larguraPlot - startPlotX ), alturaPlot); //LADO ESQUERDO TRIANGULO
ctx.lineTo((startPlotX + larguraPlot), alturaPlot); //LADO DIREITO TRIANGULO
ctx.closePath();
// the fill color
ctx.fillStyle = "#FFCC00"; //COR INFORMADA PELO USUARIO
ctx.fill();


//PENTAGONO
var ctx = canvas.getContext('2d');
ctx.beginPath();
ctx.strokeStyle = 'rgb(255, 0, 0)';
var Base = {x:100, y:10}; //onde o inicio do desenho sera plotado
ctx.moveTo(Base.x, Base.y);
var radius = (10*5)/2; //tamanho da figura (lagura * altura passada pelo usuario)
var sidesNumber = 5;
for(var i=1;i<=sidesNumber; ++i){
	var th = i * 2 * Math.PI/sidesNumber;
	var x = Base.x + radius * Math.sin(th);
	var y = Base.y + radius - radius * Math.cos(th);
	ctx.lineTo(x,y);
}
ctx.stroke();
ctx.fill();

//OVAL
var ctx = canvas.getContext('2d');
/*=================================================================
* |VARIAVEIS DEFINIDAS COM BASE NOS DADOS INFORMADOS PELO USUARIO |
* =================================================================
*/
var centerX = 100;
var centerY = 100;
var largura = 100;
var altura = 10;
ctx.beginPath();
ctx.ellipse(centerX, centerY, largura, altura, 0, 0, 2 * Math.PI);
ctx.fill();

//TRAPEZIO
var canvas = document.getElementById('myCanvas');
var context = canvas.getContext("2d");
var beginXbase = 100;
var endXbase = 500;
var altura = 200;
var superiorTrap = endXbase - ((endXbase - beginXbase) / 8); //calculo para tornar a figura um trapezio
/*=================================================
* |LARGURA DA FIGURA IGUAL  endXbase - beginXbase |
* =================================================
*/
context.moveTo(150,50);
context.lineTo(superiorTrap,50);
context.lineTo(endXbase,300);
context.lineTo(beginXbase,300);
context.closePath();
context.fill();


//HECTAGONO
var ctx = canvas.getContext('2d');
ctx.beginPath();
ctx.strokeStyle = 'rgb(255, 0, 0)';
var Base = {x:100, y:10}; //onde o inicio do desenho sera plotado
ctx.moveTo(Base.x, Base.y);
var radius = (10*5)/2; //tamanho da figura (lagura * altura passada pelo usuario)
var sidesNumber = 8;
for(var i=1;i<=sidesNumber; ++i){
	var th = i * 2 * Math.PI/sidesNumber;
	var x = Base.x + radius * Math.sin(th);
	var y = Base.y + radius - radius * Math.cos(th);
	ctx.lineTo(x,y);
}
ctx.stroke();
ctx.fill();
