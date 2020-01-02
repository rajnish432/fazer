import java.util.Scanner;

public class mergestr
{
	public static void main(String[] args) 
	{
		String arr[]= {"raj","kum","sam","nik","jit"};
		 print(arr);
		 int n=arr.length;
		 merge(arr,0,n-1);
		 System.out.println();
		 System.out.println("merged array: ");
		 print(arr);		 
	}
	
	static void print(String arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
	}
	
	static void merge(String arr[],int min,int max)
	{
		int s=min,e=max,mid;
	 if(e>s)
	 {
		 mid=(e+s)/2;
		 merge(arr,s,mid);
		 merge(arr,mid+1,e);
		 mergesortr(arr,s,mid,e);
		
	 }
	}
	
	static void mergesortr(String arr[],int min,int mid,int max)
	{
		String temp[]=new String[max-min+1];
		int k=0;
		int i=min,j=mid+1;
		
		while(i<=mid && j<=max)
		{
			if(arr[i].compareToIgnoreCase(arr[j])<0)
			{
			temp[k]=arr[i];
			k++;
			i++;
			}
			else
			{
				temp[k]=arr[j];
				k++;
				j++;
			}
		}
		
		while(i<=mid)              //copying remaining elements if any
		{
			temp[k]=arr[i];
			k++;
			i++;
		}
		
		while(j<=max)
		{
			temp[k]=arr[j];
			k++;
			j++;
		}
		
		for(i=min;i<=max;i++)
		{
			arr[i]=temp[i-min];
		}
		
	}

	

}
