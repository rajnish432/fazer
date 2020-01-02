import java.util.*;

public class windchill {

	public static void main(String[] args) 
	{
		int t=Integer.parseInt(args[0]);
		int v=Integer.parseInt(args[1]);
		
		if(Math.abs(t)>50 && v>3 && v<120)
		{
			double absv=Math.pow(v,0.16);
			double w=35.74+0.6215*t+(0.4275*t-35.75)*absv;
						System.out.print(w);

		}
		else
		{
			System.out.println("out of range");

		}
	}

}
