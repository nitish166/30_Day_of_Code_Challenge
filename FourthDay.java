import java.util.Scanner;

public class FourthDay {

	private int age;
	public FourthDay(int initalAge)
	{
		
		if(initalAge<0)
		{
		age=0;
		System.out.println("Age is not valid, setting age to 0..");
		}
		else
		{
			age=initalAge;	
		}
		
	}

	public void amIOld()
	{
		if(age<13)
		System.out.println("You are young.");
		
		else if(age>=13 && age<18)
		System.out.println("You are a teenager.");
		
		else
		System.out.println("You are old.");
		
	}
	public void yearPasses()
	{
		age++;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0 ; i<T;i++)
        {
        	int age = scan.nextInt();
        	FourthDay f = new FourthDay(age);
        	f.amIOld();
        	for(int j=0;j<3;j++)
        	{
        		f.yearPasses();
        	}
        	f.amIOld();
        	System.out.println();
        	
        }
        scan.close();
	}

}
