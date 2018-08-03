//class with factorial function and throws two kind of exception

package com.BasicException;

public class Factorial {

	private int number;
	private long factorial = 1;
//function throws explicitly two types of exception
	public int getFactorial(int number) throws InvalidInputException, FactorialException {
		if (number < 2) {
			throw new InvalidInputException("Number can't be less than 2");
		}

		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		if (factorial > 2147483647 || factorial <= 0) {
			throw new FactorialException("Factorial value is more than int maximum value");
		}
		return (int)factorial;
	}
}
