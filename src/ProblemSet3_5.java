/**
 * INSTRUCTIONS.
 * 
 * The following exercises are, perhaps, more mathematically inclined than previous
 * problem sets. While they might be challenging, they are certainly doable.
 * 
 * You can (and should!) solve each of them using only the operators, conditional control
 * structures, and iterative control strucures we've covered. You are not permitted to use
 * recursive code in your solutions.
 * 
 * Please be mindful of the expected outputs, as your code will be tested against that
 * directly. If you're unsure, please ask for clarification.
 * 
 * This problem set is worth 25 points and is due no later than 11:59pm on October 28, 2018.
 */

public class ProblemSet3_5 {
	
	public static void main(String[] args) {
		ProblemSet3_5 ps = new ProblemSet3_5();
		
		// test your solutions here
		
		ps.primes(1, 1000);
		ps.leapYears(3);
		ps.palindromicNumbers(122);
		ps.fibonacci(3);
	}
	
	/**
	 * How many prime numbers are there between @start and @end, where @start and @end
	 * are positive integers in the range [1, @Integer.MAX_VALUE]?
	 * 
	 * Print your solution in the following formats: "There is X prime number."
	 *                                               "There are X prime numbers."
	 * 
	 * @param start
	 * @param end
	 */
	
	public void primes(int start, int end) {
		boolean prime;
		int primeCount = 0;
		start = start + 1;
		for (int i= start; i < end; i++) {
			prime = true;
			outerLoop:
			for (int j = 2; j<= i/2; j++) {
				if (i % j == 0) {
					prime = false;
					break outerLoop;
				}
			}
	
			if (prime == true) {
				primeCount++;
			}
		}
		if (primeCount== 1) {
			System.out.println("There is " + primeCount + " " + "prime number"); }
			else if (primeCount > 1) {
				System.out.println("There are " + primeCount + " " + "prime numbers");	
			}
		}
	
	/**
	 * What are the next @count leap years?
	 * 
	 * Print your solution in the following formats: "The next leap year is X."
	 *                                               "The next 2 leap years are X and Y."
	 *                                               "THe next N leap years are A, ..., X, Y, and Z."
	 * 
	 * @param count
	 */
	
	public void leapYears(int count) {
		if (count < 1) {
			System.out.println("Cannot compute " + count +" leap years. Please enter a value greater than or equal to 1");
			}
		else if (count == 1) {
			System.out.println("The next leap year is 2020");
		}
		else if (count == 2) {
			System.out.println("The next 2 leap years are 2020 and 2024");
	}
		else {
			System.out.print("The next " + count + " leap years are ");
			int x = 0;
			int year = 2016;
			while (x < count) {
				year += 4;
				if (year % 100 == 0 && year % 400 != 0) {
					year += 4;
				}
				x++;
				if (x == count) {
					System.out.print("and " + year + ".");
				}
				else {
					System.out.print(year + ", ");
				}
			}
			System.out.println("");
		}
	}
	
				
				
			
				
		

	/**
	 * Is @number a palindromic number?
	 * 
	 * Print your solution in the following formats: "X is a palindromic number."
	 *                                               "X is not a palindromic number."
	 *                                               
	 * @param number
	 */
	
	public void palindromicNumbers(int number) {
		int x;
		int sum = 0;
		int y;
		int z = number;
		
		y = z;
				while (z> 0) {
					x=z% 10;
							sum=(sum*10)+x;
					z=z/10;
			}
		if(y == sum)
			System.out.println(number + " is a palindromic number.");
			else
				System.out.println(number + " is not a palindromic number");
			
	}
	
	/**
	 * What is the @nth Fibonacci number, where @n is a positive integer?
	 * 
	 * Print your solution in the following formats: "The 21st Fibonacci number is X."
	 *                                               "The 22nd Fibonacci number is X."
	 *                                               "The 23rd Fibonacci number is X."
	 *                                               "The 24th Fibonacci number is X."
	 *                                               
	 * @param n
	 */
	
	public void fibonacci(int n) {
		int count = n ;
		int x = 0;
		int y = 1;
		int i = 1;
		while (i <= count) {
			int priorSum = x + y;
			x = y;
			y = priorSum;
			i++;
			
			
		}
		System.out.println("The " + count + "th Fibonacci number is " + x + ".");
		
	}
	
	/**
	 * What is the sum of all multiples of @x and @y less than @limit, where @x, @y, and
	 * @limit are positive integers?
	 * 
	 * Print your solution in the following format: "The sum is X."
	 * 
	 * @param limit
	 */
	
	public void multiples(int x, int y, int limit) {
		
	}
}