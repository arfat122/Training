package com.sonata.AnnotatioExample;


class ShowOne{
	public void Show() {
		System.out.println("It is my ShowOne");
	}

}

class ShowTwo extends ShowOne{
	@Override
	public void Show() {
		super.Show();
		System.out.println("It is my ShowTwo");
	}
}

public class MyAnnotations{
	public static void main(String[] args) {
		ShowTwo s1=new ShowTwo();
		s1.Show();
	}
}