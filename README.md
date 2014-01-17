modulomagic
===========
interesting/mesmerizing bitmap patterns

a 100x100 grid of RGB pixels, running at 30fps. magic comes from this line:

pixels[i] = i % tickCount * tickCount;

so try changing that around and have fun

thanks to Ryan van Zeben for his JFrame tutorial