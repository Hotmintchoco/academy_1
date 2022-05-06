package com.ezen.ex01;

public class ShollowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Rectangle org = new Rectangle(1, 1, 8, 8);
		Rectangle cpy;
		
		cpy = (Rectangle) org.clone();
		org.showPosition();
		cpy.showPosition();
		
		org.changePos(3, 3, 7, 7);
		org.showPosition();
		cpy.showPosition();
	}

}

class Rectangle implements Cloneable{
	private Point1 upperLeft;
	private Point1 lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point1(x1, y1);
		lowerRight = new Point1(x2, y2);
	}
	
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Rectangle copy = (Rectangle) super.clone();
		
		copy.upperLeft = (Point1) upperLeft.clone();
		copy.lowerRight = (Point1) lowerRight.clone();
		
		return copy;
	}
	
	public void showPosition() {
		System.out.println("좌측 상단");
		upperLeft.showPosition();
		
		System.out.println("우측 하단");
		lowerRight.showPosition();
	}
	
}

class Point1 implements Cloneable{
	private int xPos;
	private int yPos;
	
	public Point1(int x, int y) {
		xPos = x; yPos = y;
	}
	
	public void showPosition() {
		System.out.println("[" + xPos + "," + yPos + "]");
	}
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
