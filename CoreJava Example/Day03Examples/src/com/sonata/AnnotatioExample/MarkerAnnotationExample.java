package com.sonata.AnnotatioExample;

class  A{
	public void showMyData() {
		System.out.println("Super class A");
	}
}
class B extends A{
	@Deprecated
	public void show() {
		System.out.println("My Show Method");
	}
	@Override
	@SuppressWarnings("unchecked")
	public void showMyData() {
		System.out.println("Super class B");
	}
}

public class MarkerAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B x=new B();
		x.showMyData();
	}

}
