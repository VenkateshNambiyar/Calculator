package com.calculator;

import java.util.*;

 public class Calculation {
	public Scanner scanner = new Scanner(System.in);
	
	public double firstNumber;
	public double secondNumber;
	public int storeElements;
	public double result;
	private final int zero = 0;
	
	public final void add() {
		System.out.println("***Addition***");
		System.out.println("Enter the How many numbers to calculate:: ");
		storeElements = scanner.nextInt();
		
		check();
		System.out.println("Addition Result = \t" + result);
	}
	
	public final void check() {
		System.out.println("Enter the elements");
		int setOfValues[] = new int [storeElements];
		
		for(int i = 0; i < setOfValues.length; i++) {
			setOfValues[i] = scanner.nextInt();
		}
		result = Operators.addition(setOfValues);
	}
	
	public final void subtract() {
		result = Operators.subtraction(firstNumber , secondNumber);
		
		System.out.println("Subtraction Result = \t" + result);
	}
	
	protected void multiply() {
		result = Operators.multiple(firstNumber , secondNumber);
		
		System.out.println("Multiplication Result = " + result);
	}
	
	protected void divide() {
		validate();
		result = Operators.divide(firstNumber , secondNumber);
		
		System.out.println("Division Result = \t" + result);
		result = Operators.remainder(firstNumber , secondNumber);
		
		System.out.println("Remainder Result = \t" + result);
	}
	
	public final void validate() {
		if ((firstNumber == zero ) && (secondNumber == zero)) {
			throw new IncorrectDetailsException("Numbers Not Divided By Zero So kindly Enter Valid Number");
		} else if (secondNumber == zero) {
			throw new IncorrectDetailsException("Numbers Not Divided By Zero So kindly Enter Valid Number");
		} else {
			System.out.println("Error");
		}
	}
	
	public final void assignData() {
		System.out.print(" Enter first number : \t");
		firstNumber = scanner.nextInt();
		
		System.out.print("Enter second number: \t");
		secondNumber = scanner.nextInt();
	}
	
	public void displayFunction() {
		add();
		assignData();
		subtract();
		multiply();
		divide();
	}		
	
	public void verify() {
		while (true) {
			try {
				displayFunction();
				break;
			} catch (InputMismatchException e) {
				scanner.nextLine();
			}
		}
	}
	
	public static void main(String[] args) {
		Calculation show = new Calculation();
		
		show.verify();
	}
}