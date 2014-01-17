modulomagic
===========
interesting/mesmerizing bitmap patterns

grab the compiled jar here for pretty colors
https://www.dropbox.com/s/i3fq4x0cc1ruw55/bugs.jar

a 100x100 grid of RGB pixels, running at 30fps. magic comes from this line:

pixels[i] = i % tickCount * tickCount;

so try changing that around and have fun with it, if you make any nice ones i'd be interested in seeing them!

thanks to Ryan van Zeben for his JFrame tutorial

