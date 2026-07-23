package oo2;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.*;
import javax.swing.*;

public class Game extends Canvas {
	static Random rand = new Random();
	static Ball[] balls = {new Ball(rand.nextInt(300), rand.nextInt(300), 30, 30, rand.nextInt(10) + 1, rand.nextInt(10) + 1), new Ball(rand.nextInt(300), rand.nextInt(300), 30, 30, rand.nextInt(10) + 1, rand.nextInt(10) + 1), new Ball(rand.nextInt(300), rand.nextInt(300), 30, 30, rand.nextInt(10) + 1, rand.nextInt(10) + 1)};
	
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
		for (Ball ball : Game.balls) {
			ball.move();
		}
		this.repaint();
	}
	
	public void paint(Graphics g) {
		g.drawRect(0, 0, 300, 300);
		for (Ball ball : Game.balls) {
			g.drawOval(ball.x, ball.y, ball.width, ball.height);
		}
	}

}
