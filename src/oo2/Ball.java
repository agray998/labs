package oo2;

public class Ball {
	public int x, y, width, height;
	private int dirX, dirY;
	
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
	
	public void move() {
		this.x += this.dirX;
		this.y += this.dirY;
		if (this.x + this.width >= 300) {
			this.x = 300 - this.width;
			this.dirX *= -1;
		}
		if (this.x <= 0) {
			this.x = 0;
			this.dirX *= -1;
		}
		if (this.y + this.height >= 300) {
			this.y = 300 - this.height;
			this.dirY *= -1;
		}
		if (this.y <= 0) {
			this.y = 0;
			this.dirY *= -1;
		}  
	}
}
