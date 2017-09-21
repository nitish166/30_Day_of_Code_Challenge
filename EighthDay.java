import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EighthDay {

	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	Map<String,Integer> PhoneDic = new HashMap<String,Integer>();
	for(int i=0 ;i<n;i++)
	{
		String name = scan.next();
		int phone = scan.nextInt();
		PhoneDic.put(name, phone);
		scan.nextLine();
	}
	
	
	while(scan.hasNext())
	{
		String s = scan.next();
		if(PhoneDic.get(s)==null)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println(s + "="+PhoneDic.get(s));
		}
		
	}
	scan.close();
	}

}
