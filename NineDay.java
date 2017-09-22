/*
 *  @author     : Nitish Kumar
 *  Filename    : NineDay.java
 *  Timestamp   : 06:21 AM 22-SEPT-2017
 *  Description : https://www.hackerrank.com/challenges/30-binary-numbers/problem
 *
 */
import java.util.Scanner;


public class NineDay {

	public static int fact(int num)
	{
		if( num>1)
		{
			return num*fact(num-1);
		}
		else
		{
			return num;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = fact(n);
		System.out.println("Number is :"+result);

	}

}
