public class power 
{
	public static void main(String[]args)
	{
		int j=0;
		int power=1;
		
			int N=Integer.parseInt(args[0]);
			if(N>0 && N<=31)
			{
			while(j<=N)
			{
				System.out.println("2^"+j+" ="+power);
			    	power=power*2;
				j++;			
			}
			}
			else
			{
				System.out.println("overflows as int limit is 31");
			}
		
	}
}
