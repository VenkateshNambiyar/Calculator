package com.calculator;

import java.util.*;

 public class Calculation {
	private final Scanner scanner = new Scanner(System.in);
	
	private double firstNumber;
	private double secondNumber;
	private int storeElements;
	private double result;
	private final int zero = 0;
	
	private final void add() {
		System.out.println("***Addition***");
		System.out.println("Enter the How many numbers to calculate:: ");
		storeElements = scanner.nextInt();
		
		validateAdd();
		System.out.println("Addition Result = \t" + result);
	}
	
	private final void validateAdd() {
		System.out.println("Enter the elements");
		int setOfValues[] = new int [storeElements];
		
		for(int i = 0; i < setOfValues.length; i++) {
			setOfValues[i] = scanner.nextInt();
		}
		result = Operators.addition(setOfValues);
	}
	
	private final void subtract() {
		result = Operators.subtraction(firstNumber , secondNumber);
		
		System.out.println("Subtraction Result = \t" + result);
	}
	
	private final void multiply() {
		result = Operators.multiple(firstNumber , secondNumber);
		
		System.out.println("Multiplication Result = " + result);
	}
	
	private final void divide() {
		validateDivide();
		result = Operators.divide(firstNumber , secondNumber);
		
		System.out.print("Division Result = " + result);
		result = Operators.remainder(firstNumber , secondNumber);
		
		System.out.print("\t Remainder Result = " + result);
	}
	
	private final void validateDivide() {
		if ((firstNumber == zero ) && (secondNumber == zero)) {
			throw new IncorrectDetailsException("Numbers Not Divided By Zero So kindly Enter Valid Number");
		} else if (secondNumber == zero) {
			throw new IncorrectDetailsException("Numbers Not Divided By Zero So kindly Enter Valid Number");
		} else {
			System.out.print("Division Result :\t");
		}
	}
	
	private final void assignData() {
		System.out.print(" Enter first number : \t");
		firstNumber = scanner.nextInt();
		
		System.out.print("Enter second number: \t");
		secondNumber = scanner.nextInt();
	}
	
	private void displayFunction() {
		add();
		assignData();
		subtract();
		multiply();
		divide();
	}		
	
	private final void checkException() {
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
		Calculation display = new Calculation();
		
		display.checkException();
	}
}