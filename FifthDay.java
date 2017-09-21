import java.util.Scanner;
public class FifthDay {

	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int result;
    for(int i=1;i<=10;i++)
    {
    	result = i*n; 
    	System.out.println(n+" x "+i+" = "+result);
    }
	}

}
