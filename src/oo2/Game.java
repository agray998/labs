package oo2;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.*;
import javax.swing.*;

public class Game extends Canvas {
	// create array of 3 balls
	
	Game() {
		JFrame jframe = new JFrame();
		this.setSize(400, 400);
		jframe.add(this);
		jframe.pack();
		jframe.setVisible(true);
		
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};
		
		t.schedule(tt, 0, 50);
		
		jframe.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing (WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}
	
	public void draw() {
		// update positions of all balls
		this.repaint();
	}
	
	public void paint(Graphics g) {
		g.drawRect(0, 0, 300, 300);
		// redraw balls
	}

}
