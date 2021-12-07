package com.sonata;
import com.sonata.Interface.ShapeInterface;
import com.sonata.JavaBean.Shape;
public class Square extends Shape implements ShapeInterface{

	@Override
	public double Area() {
		double x=(super.getLength()*super.getLength());
		return x;
	}
	

}
