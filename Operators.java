package com.calculator;

public class Operators {
	private static Double operationResult = 0.0;
    
	public static double addition(final int... setOfValues) {
		for(double additionOperation : setOfValues) {
			operationResult = operationResult + additionOperation;	
		}
		return operationResult;
	}
	
	protected static final double multiple(final double firstNumber, final double secondNumber) {
		operationResult = firstNumber * secondNumber;
		
		return operationResult;
	}
	
	public static final double subtraction(final double firstNumber, final double secondNumber){
		operationResult = firstNumber - secondNumber;
		
		return operationResult;
	}
	
	protected static synchronized double divide(final double firstNumber, final double secondNumber){
		operationResult = firstNumber / secondNumber;
		
		return operationResult;
	}
	
	public static final synchronized double remainder(final double firstNumber, final double secondNumber){
		operationResult = firstNumber % secondNumber;
		
		return operationResult;
	}
}