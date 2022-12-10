package javatech;

public class Leavl2 { // Main is class name
	public static void main(String[] args) {
		System.out.println("Welcome to Java World!");
		int a = 20, b = 10;
		// here int is datatype, a is variable
		System.out.println("Addition is " + (a + b));

		// Ex 2
		for (int i = 1; i <= 10; i++) {
			if (isPrime(i)) {
				System.out.println("Prime Numbers are " + i);
			}
			if (i % 2 == 0) {
				System.out.println("Even " + i);
			} else {
				System.out.println("Odd " + i);
			}
		}
		System.out.println("end!!!");
	}

	private static boolean isPrime(int n) {
		// since 0 and 1 is not prime return false.
		if (n == 1 || n == 0)
			return false;
		// Run a loop from 2 to n-1
		for (int i = 2; i <= n / 2; i++) {
			// if the number is divisible by i, then n is not a prime number.
			if (n % i == 0)
				return false;
		}
		// otherwise, n is prime number.
		return true;
	}
}
