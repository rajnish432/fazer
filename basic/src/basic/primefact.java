package basic;
import java.util.*;

public class primefact 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		for(int i=2;i<=num;i++)
		{
			while(num%i==0)
			{
				System.out.print(i+" ");
				num=num/i;
			}
		}
		
		
	}
}
