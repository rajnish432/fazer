import java.util.*;
import java.io.*;

public class leapcheck
{
	public static void main(String[] args)
	{
		int count=0;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int temp=year;
		while(year>0)
		{
			int rem=year%10;
			year=year/10;
		    rev=rev*10+rem;
			count++;
		}
		
		if(count==4)
		{
		if((temp%4==0) && (temp%100!=0) || (temp%400==0))
		
			System.out.println("Leap year");
		
		else
		System.out.println("not a leap year");
		}
		else
		{
			System.out.println("Enter 4 digit value");
		}
	}
	
}