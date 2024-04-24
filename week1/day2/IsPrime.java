package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// input is 9 which is not a prime;
		int number=9, j=0;
		for(int i=2; i<=10; i++)
		{
			if (number%i==0) 
			{
				j=j+1;
			}
		}
		
		if(j==1) 
		{
			System.out.println("The number "+number+" is a Prime Number");
		} 
		else
		{
			System.out.println("The number "+number+" is Not a Prime Number");
		}
	}

}
