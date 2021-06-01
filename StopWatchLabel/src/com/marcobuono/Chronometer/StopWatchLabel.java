package com.marcobuono.Chronometer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.Duration;

import javax.swing.JLabel;
import javax.swing.Timer;

public class StopWatchLabel extends JLabel implements MouseListener {

	private long startTime;   // Start time of timer.
							  //   (Time is measured in milliseconds.)
	private boolean running;  // True when the timer is running.
	
	private Timer timer;
	
	/**
	 * Constructor sets initial text on the label to
	 * "Click to start timer." and sets up a mouse listener
	 * so the label can respond to clicks.
	 */
	public StopWatchLabel() {
		super("  Click to start timer.  ", JLabel.CENTER);
		addMouseListener(this);
	}
	
	/**
	 * Tells whether the timer is currently running.
	 */
	public boolean isRunning() {
		return running;
	}
	
	/**
	 * React when the user presses the mouse by starting or stopping
	 * the timer and changing the text that is shown on the label.
	 */
	public void mousePressed(MouseEvent evt) {
		if (running == false) {
			// delay of 200 milliseconds for the timer
			timer = new Timer(200, new ActionListener() {
	            @Override // anonymous innerclass for the ActionListener
	            public void actionPerformed(ActionEvent e) {
	                long runningTime = System.currentTimeMillis() - startTime;
	                double seconds = runningTime / 1000.0;
	    			setText("Time: " + seconds + " sec.");
	            }
	        });
			// Record the time and start the timer.
			running = true;
			startTime = evt.getWhen();  // Time when mouse was clicked.
			//setText("Timing....");
			timer.start();
		} else {
			// Stop the timer.  Compute the elapsed time since the
			// timer was started and display it.
			running = false;
			long endTime = evt.getWhen();
			double seconds = (endTime - startTime) / 1000.0;
			setText("Time: " + seconds + " sec.");
			timer.stop();
		}
	}
	
	public void mouseReleased(MouseEvent evt) { }
	public void mouseClicked(MouseEvent evt) { }
	public void mouseEntered(MouseEvent evt) { }
	public void mouseExited(MouseEvent evt) { }

}
