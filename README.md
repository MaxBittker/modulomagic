modulomagic
===========
interesting/mesmerizing bitmap patterns

grab the compiled jar here for pretty colors

https://dl.dropboxusercontent.com/u/18423113/bugs2.jar

a 100x100 grid of RGB pixels, running at 30fps. magic comes from this line:

bitMap[x][y]=(x*y %tickCount * tickCount *2);

so try changing that around and have fun with it, if you make any nice ones i'd be interested in seeing them!

thanks to Ryan van Zeben for his JFrame tutorial

