package oo2;

public class Ball {
	public int x, y, width, height;
	private int dirX, dirY;
	private static int worldW, worldH;
	
	Ball(int x, int y, int width, int height, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.dirX = dirX;
		this.dirY = dirY;
	}
	
	Ball(int x, int y, int width, int height) {
		this(x, y, width, height, 1, 1);
	}
	
	public static void setWorld(int w, int h) {
		Ball.worldH = h;
		Ball.worldW = w;
	}
	
	public static int getWorldW() {
		return Ball.worldW;
	}
	
	public static int getWorldH() {
		return Ball.worldH;
	}
	
	public void move() {
		this.x += this.dirX;
		this.y += this.dirY;
		if (this.x + this.width >= Ball.worldW) {
			this.x = Ball.worldW - this.width;
			this.dirX *= -1;
		}
		if (this.x <= 0) {
			this.x = 0;
			this.dirX *= -1;
		}
		if (this.y + this.height >= Ball.worldH) {
			this.y = Ball.worldH - this.height;
			this.dirY *= -1;
		}
		if (this.y <= 0) {
			this.y = 0;
			this.dirY *= -1;
		}  
	}
	
	public void collision(Ball b) {
		if ((this.x + this.width >= b.x) && (this.x < b.x + b.width)) {
			if ((this.y + this.height >= b.y) && (this.y < b.y + b.height)) {
				this.dirX *= -1;
				b.dirX *= -1;
				this.dirY *= -1;
				b.dirY *= -1;
				this.move();
				b.move();
			}
		}
	}
	
}
