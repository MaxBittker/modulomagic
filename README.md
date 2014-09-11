modulomagic
===========
Interesting/mesmerizing bitmap patterns

A 100x100 grid of RGB pixels, running at 30fps. magic comes from this line:

`bitMap[x][y]=(x*y* tickCount *2);`

Try changing that around and have fun with it, if you make any nice ones I'd be interested in seeing them!

Thanks to Ryan van Zeben for his JFrame tutorial


Compiling
---------
Run `javac GameClass.java` to generate the class file, then `java GameClass` to run the game

For a precompiled jar file, see https://dl.dropboxusercontent.com/u/18423113/bugs2.jar

Other Equations:
modal:

bitMap[x][y]= (int)Math.cos(((x*y+	(tickCount/100)	)%100  )*5 )*x*y*tickCount;

swings, becomes static:

bitMap[x][y]= (int)(x*y * tickCount * Math.cos(((x+y*tickCount)%100)/20 )); 

zooming binary spotlight pattern: (I should add a speed variable)

bitMap[x][y]= (int) (Math.sin(tickCount*x/100) - Math.cos(y*tickCount/100));

weird binary sinusoidal

bitMap[x][y]= (int) (Math.tan(tickCount*x) - Math.cos(y*tickCount));

bounces and crunches:

bitMap[x][y]= (int) ( y * 100*Math.cos(x *tickCount/100));

modal, rainbow, bizzare

bitMap[x][y]= 100*(int)( tickCount*Math.sin(Math.cos(x*y*(tickCount/100) )));

pulsing split staircase:

bitMap[x][y]= (int) (x*tickCount) - (y*tickCount);

scrolling pattern:

bitMap[x][y]=  (int) (x-y*tickCount) + (x*y-tickCount);

big bang:

bitMap[x][y]= (int) (Math.random() * Math.exp( ((tickCount*.1)%100)) );



Simple, best example:
bitMap[x][y]= (int) tickCount*x*y;
