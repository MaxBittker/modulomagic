modulomagic
===========
Interesting/mesmerizing bitmap patterns

A 100x100 grid of RGB pixels, running at 30fps. magic comes from this line:

`pixels[i] = i % tickCount * tickCount;`

Try changing that around and have fun with it, if you make any nice ones I'd be interested in seeing them!

Thanks to Ryan van Zeben for his JFrame tutorial


Compiling
---------
Run `javac GameClass.java` to generate the class file, then `java GameClass` to run the game

For a precompiled jar file, see https://www.dropbox.com/s/i3fq4x0cc1ruw55/bugs.jar
