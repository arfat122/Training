package com.sonata;

import com.sonata.Interface.ShapeInterface;
import com.sonata.JavaBean.Shape;

public class Triangle extends Shape implements ShapeInterface  {

	@Override
	public double Area() {
		double x=0.5*(super.getBreadth()*super.getWidth());
		return x;
	}
	

}
