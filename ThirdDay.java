import java.util.Scanner;


public class ThirdDay {

	public static void main(String[] args) {
        int n;
        Scanner scan =new Scanner(System.in);
        n = scan.nextInt();
        if(n%2==0)
        	if(n>=2 && n<=6 )
            {
        	   System.out.println("Not Weird");
            }
        	else if(n>=6 && n<=20)
        	{
        		System.out.println("Weird");
        	}
        	else
        	{
        		System.out.println("Not Weird");
        	}
        else
        {
        	System.out.println("Weird");
        }
        
        
	}

}
