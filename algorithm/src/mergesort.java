import java.util.Scanner;

public class mergesort 
{
	void sort(int arr[],int min,int max)     //sort 2 arrays by dividing at mid
	{
		if(min<max)
		{
			int mid=(min+max)/2;
			sort(arr,min,mid);
			sort(arr,mid+1,max);
			
			merge(arr,min,mid,max);        
		}
	}
	
	void merge(int[] arr,int min,int mid,int max)
	{
		int n1=mid-min+1;                          //length of 2 arrays
		int n2=max-mid;
		
		//temporary arrays;
		int[] left=new int[n1];
		int[] right=new int[n2];
		
		for(int i=0;i<n1;i++)
		
			left[i]=arr[min+i];
		
		for(int j=0;j<n2;j++)
		
			right[j]=arr[mid+1+j];
		
		
		int i=0;
		int j=0;
		int k=min;  //initial index of merged array
	
		while(i<n1 && j<n2)
		{
		if(left[i]<=right[j])   //copying the elements into sorted array.
		{
			arr[k]=left[i];
			i++;
		}
		else
		{
			arr[k]=right[j];
			j++;
		}
		k++;
		}
		
		while(i<n1)              //copying remaining elements if any
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
		
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{	
			arr[i]=sc.nextInt();			
		}
		
		mergesort ob=new mergesort();
		ob.sort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++)
		{	
			System.out.print(arr[i]);			
		}
		
	}

}
