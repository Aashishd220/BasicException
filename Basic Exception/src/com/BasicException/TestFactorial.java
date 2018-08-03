//class with main function having try catch block
package com.BasicException;

public class TestFactorial {
	public static void main(String args[]) {
		Factorial factorial = new Factorial(); //object creation
		int ans;
		//checks exception
		try {
			ans = factorial.getFactorial(13);
			System.out.println(ans);
		} 
		//catches exception for input less than 2
		catch (InvalidInputException e) {
			e.printStackTrace();
		}
		//catches exception for factorial value more than integer value
		catch (FactorialException e) {
			e.printStackTrace();
		}
	}
}
