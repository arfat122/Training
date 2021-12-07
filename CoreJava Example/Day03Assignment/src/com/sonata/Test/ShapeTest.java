package com.sonata.Test;
import com.sonata.Rectangle;
import com.sonata.Square;
import com.sonata.Triangle;
import com.sonata.Interface.ShapeInterface;
import com.sonata.JavaBean.Shape;

public class ShapeTest extends Shape implements ShapeInterface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1=new Triangle();
		Rectangle r1=new Rectangle();
		Square s1=new Square();
		t1.setBreadth(5);
		t1.setWidth(10);
		r1.setLength(10);
		r1.setBreadth(20);
		s1.setLength(10);
		System.out.println("Area of Triangle:"+t1.Area());
		System.out.println("Area of Rectangle:"+r1.Area());
		System.out.println("Area of Square:"+s1.Area());
		
	}

}
