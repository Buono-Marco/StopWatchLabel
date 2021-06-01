package com.marcobuono.Chronometer;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chrnometer extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Chronometer");
		StopWatchLabel watch = new StopWatchLabel();
		watch.setPreferredSize(new Dimension(200, 100));
		frame.setContentPane(watch);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation( (screenSize.width - frame.getWidth())/2, 
				(screenSize.height - frame.getHeight())/2 );
		frame.setVisible(true);
	}

}
