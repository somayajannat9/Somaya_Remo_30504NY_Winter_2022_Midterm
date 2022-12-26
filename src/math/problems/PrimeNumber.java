package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
//range
		int min = 2;
		int max = 1000000;
		//find all prime numbers in the given range
		for (int n = min; n <= max; n++) {
			//check if this number is prime
			if (isPrime(n)) {
				System.out.println(n);
			}
		}
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / i; ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}