package oo2;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.*;
import javax.swing.*;

public class Game extends Canvas {
	Random rand = new Random();
	Ball[] balls = {new Ball(rand.nextInt(300), rand.nextInt(300), 30, 30, rand.nextInt(10) + 1, rand.nextInt(10) + 1), new Ball(rand.nextInt(300), rand.nextInt(300), 30, 30, rand.nextInt(10) + 1, rand.nextInt(10) + 1), new Ball(rand.nextInt(300), rand.nextInt(300), 30, 30, rand.nextInt(10) + 1, rand.nextInt(10) + 1)};
	
	Game() {
		int w = rand.nextInt(300) + 300;
		int h = rand.nextInt(300) + 300;
		JFrame jframe = new JFrame();
		this.setSize(w + 10, h + 10);
		jframe.add(this);
		jframe.pack();
		jframe.setVisible(true);
		Ball.setWorld(w, h);
		
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

		//		jframe.addKeyListener(new KeyListener() {
//			@Override
//			public void keyTyped(KeyEvent e) {}
//			
//			@Override
//			public void keyReleased(KeyEvent e) {}
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				if (e.getKeyChar() == 'w') {
//					
//				}
//				if (e.getKeyChar() == 'a') {
//					
//				}
//				if (e.getKeyChar() == 's') {
//					
//				}
//				if (e.getKeyChar() == 'd') {
//					
//				}
//			}
//		});
	}
	
	public void draw() {
		for (Ball ball : this.balls) {
			ball.move();
			for (Ball b : this.balls) {
				if (ball == b) {
					continue;
				}
				ball.collision(b);
			}
		}
		this.repaint();
	}
	
	public void paint(Graphics g) {
		g.drawRect(0, 0, Ball.getWorldW(), Ball.getWorldH());
		for (Ball ball : this.balls) {
			g.drawOval(ball.x, ball.y, ball.width, ball.height);
		}
	}

}
