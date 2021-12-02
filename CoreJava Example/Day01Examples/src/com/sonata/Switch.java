package com.sonata;

public class Switch {
	public static void main(String[] args) {
		int grade=92;
		switch ((grade/10)*10) {
		case 100:
			System.out.println("Excellent");
			break;
		case 90:
			System.out.println("Good Job");
			break;
		case 80:
			System.out.println("Study Harder");
			break;
		default:
			System.out.println("Failed");
			break;
		}
	}

}
