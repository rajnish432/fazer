import java.util.Scanner;

public class triplets {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int n=arr.length;
		findtriplets(arr,n);

	}
	
	static void findtriplets(int arr[],int n)
	{
		boolean found=true;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"= 0");
						found=true;
						
					}
					
				}
			}
		}
		if(found==false)
		{
			System.out.print("not exists");
		}
	}

}
