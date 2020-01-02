import java.util.*;

public class prime 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		int num=0;
		int i=0;
		for(i=0;i<=1000;i++)
		{
			int counter=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2)
			{
			al.add(i);
			}
		}
		
		System.out.print(al);
		
		for(int j=0;j<al.size();j++)
		{
			int temp=al.get(j);
			int temp1=temp;
			int rem=0,sum=0;
			while(temp>0)
			{
				rem=temp%10;
				sum=sum*10+rem;
				temp=temp/10;
			}
			
			if(temp1==sum)
			{
				System.out.println();
				System.out.println("Palindrome are: "+sum);
				
			}
		}	
	}
}
