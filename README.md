modulomagic
===========
Interesting/mesmerizing bitmap patterns

A 100x100 grid of RGB pixels, running at 30fps. magic comes from this line:

`bitMap[x][y]=(x*y %tickCount * tickCount *2);`

Try changing that around and have fun with it, if you make any nice ones I'd be interested in seeing them!

Thanks to Ryan van Zeben for his JFrame tutorial


Compiling
---------
Run `javac GameClass.java` to generate the class file, then `java GameClass` to run the game

For a precompiled jar file, see https://dl.dropboxusercontent.com/u/18423113/bugs2.jar
