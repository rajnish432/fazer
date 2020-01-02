import java.util.*;

public class prime {

	public static void main(String[] args) 
	{
		int a=0;
		int b=1000;
		
		while(a<b)
		{
			boolean flag=false;
	
		for(int i=2;i<a/2;++i)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
			
			if(!flag)
			{
				System.out.print("Prime numbers are: "+a+" ");
				++a;
			}
			else
					System.out.print("error");
		}
		}
	}

}
