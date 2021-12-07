package com.sonata;

import com.sonata.Interface.ShapeInterface;
import com.sonata.JavaBean.Shape;

public class Rectangle extends Shape implements ShapeInterface {

	@Override
	public double Area() {
		double x=(super.getWidth()*super.getBreadth());
		return x;
	}
	

}
