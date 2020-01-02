import java.util.*;
public class insertion 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String arr[]=new String[size];
		String temp=" ";
		
		for(int i=0;i< size;i++)
		{
			arr[i]=sc.nextLine();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		sc.close();
		
	}

}
