import java.util.Scanner;

public class binarycmd 
{

	public static void main(String[] args)
	{
		
		int N=Integer.parseInt(args[0]);
	
		Scanner sc=new Scanner(System.in);
		
		int arr[]={1,2,3,4,5,6,7,8,9,10};
			int min=0,max=arr.length-1;
			int mid=0;
		String choice;
		
		while(min<max)
		{
			mid=(min+max)/2;
			System.out.println("is your number: "+arr[mid]);
		
			choice=sc.nextLine();
			if(choice.equals("y"))
			{
				System.out.print("number found.");
				break;
			}
			 else
		    { 
		    	System.out.println("Is the value in first half: ");
		    	choice=sc.nextLine();
		    	if(choice.equals("y"))
		    	{
		    		max=mid;
		    	}
		         else
		    	{
		    		min=mid;
		    	}
		    }
		  
			
		   
		
		}
	}
}

