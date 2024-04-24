package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		//the range for Fibonacci series
		int range = 8;
		int first=0, second = 1,third;
		System.out.print(first+" "+second);
		for(int i = 2; i< range ;i++)
		{  
			third=first +second;
			System.out.print(" "+ third);
			first = second;
			second = third;
		}

	}

}
