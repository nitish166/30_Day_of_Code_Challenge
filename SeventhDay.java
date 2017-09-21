import java.util.*;
public class SeventhDay {
 /*
	public static void reversedArray(int arr[],int start, int end)
	{
		int temp;
		if(start >= end)
			return ;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public static void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+"");
		System.out.println("");
	}
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		//printArray(arr,n);
		//reversedArray(arr,arr[0],arr[n-1]);
		//printArray(arr,n);
		for(i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}
