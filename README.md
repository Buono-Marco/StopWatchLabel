# StopWatchLabel

Exercise 13.3 from Eck, D. J. (2018). Introduction to programming using Java, version 7.0.3. Hobart and William Smith Colleges. http://math.hws.edu/eck/cs124/downloads/javanotes7-linked.pdf

The StopWatchLabel component from section 13.4.5 in the textbook displays the text "Timing..." when the stopwatch is running. It would be nice if it displayed the elapsed time since the stopwatch was started. For that, you need to create a Timer (see section 6.4.1 in the textbook.) Add a Timer to the original source code, StopWatchLabel.java in the code directory, to drive the display of the elapsed time in seconds. Create the timer in the mousePressed() routine when the stopwatch is started. Stop the timer in the mousePressed() routine when the stopwatch is stopped. The elapsed time won't be very accurate anyway, so just show the integral number of seconds. You only need to set the text a few times per second. For the Timer method, use a delay of 200 milliseconds for the timer.
