//Program on printing prime series

package com.apjfsa;

//importing scanner class
import java.util.Scanner;

/*--defining a class for Prime  */
class Prime {

	// creating method for to check a number is prime or not
	public boolean isPrime(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
