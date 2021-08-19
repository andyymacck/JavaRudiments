public class Fibonaccisequence {

	public static void main(String[] args) {
	
		long count = 100, num1= 0, num2 = 1;
		System.out.print("Fibonacci Series of "+count+" numbers:");
		long sumOfPrevTwo = 0;
		  
		for (int i = 1; i <= count; ++i)
		{
			
			System.out.print(num1+" ");
			
			/* On each iteration we are assigning second number
			 * to the first number and assigning the sum of last two
			 * numbers to the second number
			 */
			sumOfPrevTwo = num1 + num2;
			
			num1 = num2;
			num2 = sumOfPrevTwo;
		}
	}
}
			