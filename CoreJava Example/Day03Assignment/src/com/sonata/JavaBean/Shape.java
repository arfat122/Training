package com.sonata.JavaBean;

public class Shape {
	private double  length;
	private double breadth;
	private double width;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Shape [length=" + length + ", breadth=" + breadth + ", width=" + width + "]";
	}
	
	
}
