package oo2;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.*;
import javax.swing.*;

public class Game extends Canvas {
	Random rand = new Random();
	Ball[] balls = {new Ball(rand.nextInt(300), rand.nextInt(300), 30, 30, rand.nextInt(10) + 1, rand.nextInt(10) + 1, Color.RED), new Ball(rand.nextInt(300), rand.nextInt(300), 30, 30, rand.nextInt(10) + 1, rand.nextInt(10) + 1, Color.GREEN), new Ball(rand.nextInt(300), rand.nextInt(300), 30, 30, rand.nextInt(10) + 1, rand.nextInt(10) + 1, Color.BLUE)};
	private static Ball player = new Ball(200, 200, 30, 30, 0, 0, Color.BLACK);
	
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
		
		jframe.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == 'w') {
					Game.player.dirY -= 1;
				}
				if (e.getKeyChar() == 'a') {
					Game.player.dirX -= 1;
				}
				if (e.getKeyChar() == 's') {
					Game.player.dirY += 1;
				}
				if (e.getKeyChar() == 'd') {
					Game.player.dirX += 1;
				}
			}
		});
		
	}
	
	public void draw() {
		Game.player.move();
		for (Ball ball : this.balls) {
			ball.move();
			for (Ball b : this.balls) {
				if (ball == b) {
					continue;
				}
				ball.collision(b);
			}
			ball.collision(Game.player);
		}
		this.repaint();
	}
	
	public void paint(Graphics g) {
		g.drawRect(0, 0, Ball.getWorldW(), Ball.getWorldH());
		g.setColor(Color.BLACK);
		g.drawOval(Game.player.x, Game.player.y, Game.player.width, Game.player.height);
		for (Ball ball : this.balls) {
			g.setColor(ball.getColour());
			g.drawOval(ball.x, ball.y, ball.width, ball.height);
		}
	}

}
