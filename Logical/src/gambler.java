import java.util.*;
public class gambler {

	public static void main(String[] args) 
	{
		int stake,goal,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stake amount: ");
		stake=sc.nextInt();
		System.out.println("enter goal amount: ");
		goal=sc.nextInt();
		System.out.println("enter number of times: ");
		num=sc.nextInt();
		
		
		int win=0;
		int loss=0;
		
		for(int i=0;i<num;i++)
		{
			int cash=stake;
			while(cash>0 && cash<goal)
			{
				if(Math.random()<0.5)
					cash++;
				else
					cash--;
			}
			if(cash==goal)
			{
				win++;
			}
			else
			{
				loss++;
			}
		}
		
		
		System.out.println("chances of win: "+win);
		System.out.println("chances of loss: "+loss);
		System.out.println("Percentage of wins are:"+win*100/num);
		System.out.println("Percentage of loss are:"+loss*100/num);
		
		
	}

}
