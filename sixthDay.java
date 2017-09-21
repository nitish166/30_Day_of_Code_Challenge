import java.util.*;
public class sixthDay {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int t = scan.nextInt();
	scan.nextLine();
	for(int i=0;i<t;i++)
	{
		char[] s = scan.nextLine().toCharArray();
		display(s);	
	}
	
	}

	private static void display(char[] s) {
		int i,j;
		for( i=0;i<s.length; i +=2)
		{
			System.out.print(s[i]);
		}
		System.out.print("  ");
		for(j=1 ; j<s.length; j +=2)
		{
			System.out.print(s[j]);
		}
		System.out.println();
	}
}
