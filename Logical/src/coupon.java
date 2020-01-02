import java.util.*;

public class coupon 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the N distinct numbers: ");
		int n=sc.nextInt();
		int num=collect(n);
		System.out.println("total numbers needed to have distinct coupons are "+num);
	}
	
	public static int getcoupon(int n)
	{
		return(int)(Math.random()*n);
	}
	
	public static int collect(int n)
	{
		boolean[] collected=new boolean[n];
		int count=0;
		int distinct=0;
		
		while(distinct<n)
		{
			int value=getcoupon(n);
			count++;
			
			if(!collected[value])
			{
				distinct++;
				collected[value]=true;
			}
		}
		return count;
	}
}
