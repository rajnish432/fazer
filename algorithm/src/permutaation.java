import java.util.Scanner;

public class permutaation
{
	public static void permute(char[]arr,int index)
	{
		if(index==arr.length-1)
		{
			System.out.println(String.valueOf(arr));
		}
		
		for(int i=index;i<arr.length;i++)
		{
			swaps(arr,index,i);
			permute(arr,index+1);
			swaps(arr,index,i);
		}
	}
	
	public static void swaps(char[]arr,int index,int i)
	{
		char temp=arr[index];
		arr[index]=arr[i];
		arr[i]=temp;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char []arr=str.toCharArray();
		permute(arr,0);	
		
	}

}
