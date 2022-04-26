package com.calculator;

public class Operators {
	static Double operationResult = 0.0;
    
	public static double addition(int... setOfValues) {
		
		for(double additionOperation : setOfValues) {
			operationResult = operationResult + additionOperation;
			
		}
		return operationResult;
	}
	
	protected static final double multiple(double firstNumber, double secondNumber) {
		operationResult = firstNumber * secondNumber;
		
		return operationResult;
	}
	
	public static final double subtraction(double firstNumber, double secondNumber){
		operationResult = firstNumber - secondNumber;
		
		return operationResult;
	}
	
	protected static synchronized double divide(double firstNumber, double secondNumber){
		operationResult = firstNumber / secondNumber;
		
		return operationResult;
	}
	
	public static final synchronized double remainder(double firstNumber, double secondNumber){
		operationResult = firstNumber % secondNumber;
		
		return operationResult;
	}
}