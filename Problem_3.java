// Problem 3
/*
	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143?
*/

class Problem_3 {
	public static void main(String[] args) {
		int highest_prime;
		for (int i=1;i < 600851475143; i++) {
			if ((600851475143 % i == 0) && ((i % 2 !=0) || (i % 3 != 0))) highest_prime = i;
		}
		
		System.out.printf("%d", highest_prime);
	}
}