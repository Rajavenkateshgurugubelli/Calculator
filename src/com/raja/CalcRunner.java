package com.raja;

import java.util.Scanner;

public class CalcRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
		System.out.println("Enter a number");
		double a = scan.nextDouble();
		System.out.println("Enter another number");
		double b = scan.nextDouble();
		System.out.println(
				"Select \n + for addition \n - for substraction \n * for multiplication \n / for division \n % for modulous");
		char operation = scan.next().charAt(0);
		Calculator calc = new Calculator(a,b);
		double result;

		if (operation == '+') {
			result = calc.add(a, b);
			System.out.println("Addition of " + a + " and " + b + " is " + result);
		} else if (operation == '-') {
			result = calc.sub(a, b);
			System.out.println("Substraction of " + a + " and " + b + " is " + result);
		} else if (operation == '*') {
			result = calc.mul(a, b);
			System.out.println("Multiply of " + a + " and " + b + " is " + result);
		} else if (operation == '/') {
			result = calc.div(a, b);
			System.out.println("Divison of " + a + " and " + b + " is " + result);
		} else if (operation == '%') {
			result = calc.mod(a, b);
			System.out.println("Modulous of " + a + " and " + b + " is " + result);
		} else {
			System.out.println("select vaild operations only !");
			System.out.println(
					"Select /n + for addition /n - for substraction /n * for multiplication /n / for division /n % for modulous");
		}
	}
}
}
