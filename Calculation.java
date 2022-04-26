package com.calculator;

import java.util.*;

 public class Calculation {
	public Scanner getValue = new Scanner(System.in);
	
	public double firstNumber;
	public double secondNumber;
	public int storeElements;
	public double result;
	private final int zero = 0;
	
	public final void getAdd() {
		System.out.println("***Addition***");
		System.out.println("Enter the How many numbers to calculate:: ");
		storeElements = getValue.nextInt();
		
		addValidation();
		System.out.println("Addition Result = \t" + result);
	}
	
	public final void addValidation() {
		System.out.println("Enter the elements");
		int setOfValues[] = new int [storeElements];
		
		for(int i = 0; i < setOfValues.length; i++) {
			setOfValues[i] = getValue.nextInt();
		
		}
		result = Operators.addition(setOfValues);
		
	}
	
	public final void getSubtract() {
		result = Operators.subtraction(firstNumber , secondNumber);
		
		System.out.println("Subtraction Result = \t" + result);
	}
	
	protected void getMultiply() {
		result = Operators.multiple(firstNumber , secondNumber);
		
		System.out.println("Multiplication Result = " + result);
	}
	
	protected void getDivide() {
		setValidation();
		result = Operators.divide(firstNumber , secondNumber);
		
		System.out.println("Division Result = \t" + result);
		result = Operators.remainder(firstNumber , secondNumber);
		
		System.out.println("Remainder Result = \t" + result);
	}
	
	public final void setValidation() {

		if ((firstNumber == zero ) && (secondNumber == zero)) {
			throw new IncorrectDetailsException("Numbers Not Divided By Zero So kindly Enter Valid Number");
		} else if (secondNumber == zero) {
			throw new IncorrectDetailsException("Numbers Not Divided By Zero So kindly Enter Valid Number");
		} else {
			System.out.println("Error");
		}
	}
	
	public final void setData() {
		System.out.print(" Enter first number : \t");
		firstNumber = getValue.nextInt();
		
		System.out.print("Enter second number: \t");
		secondNumber = getValue.nextInt();
	
	}
	
	public void displayFunction() {
		getAdd();
		setData();
		getSubtract();
		getMultiply();
		getDivide();
	}		
	
	public void setFunctions() {
		while (true) {
			
			try {
				displayFunction();
				break;
			} catch (InputMismatchException e) {
				getValue.nextLine();
			}
		}
	}
	
	public static void main(String[] args) {
		Calculation show = new Calculation();
		
		show.setFunctions();
	}
}