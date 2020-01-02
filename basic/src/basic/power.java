package basic;

public class power 
{
	public static void main(String[]args)
	{
		int j=0;
		int power=1;
		for(int i=0;i<args.length;i++)
		{
			int N=Integer.parseInt(args[i]);
			if(N>0 && N<31)
			{
			while(j<=N)
			{
				System.out.println("2^"+j+" ="+power);
			    power=power*2;
				j++;			
			}
			}
		}
	}
}
