package week1.day2;

public class FindPalindrom {

	public static void main(String[] args) {
		int input=1221;
		int output=0;
		int rem, temp;
		temp=input;
		while(temp >0) {
			rem=temp%10;
			output=(output*10)+rem;
			temp=temp/10;
			}
		if (input==output) {
			System.out.println(input+" is a pallindrom");
		}
		else {
			System.out.println(input+" is not a pallindrom");
		}
		}

	}


