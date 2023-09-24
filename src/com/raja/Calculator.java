package com.raja;

public class Calculator {

	private int i;
	private int j;

	public Calculator(double a, double b) {
		// TODO Auto-generated constructor stub
		this.i = i;
		this.j = j;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public double sub(double a, double b) {
		return a - b;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public double mul(double a, double b) {
		return a * b;
	}

	public double div(double a, double b) {
		return a / b;
	}

	public double mod(double a, double b) {
		return a % b;
	}

}
