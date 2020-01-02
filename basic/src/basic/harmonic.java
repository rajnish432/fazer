package basic;

import java.util.Scanner;

public class harmonic 
{
	public static void main(String[] args)
	{ 
		double harmo=0.0;
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		
		for(double i=1;i<=N;i++)
		{
		 harmo=harmo+1/i;
		 System.out.println(harmo);
		}
		//System.out.println(harmo);
	}
}
