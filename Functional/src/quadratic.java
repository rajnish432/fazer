import java.util.*;
import java.math.*;

public class quadratic
{
	public static void main(String[]args)
	{
		double root1,root2;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		double delta=Math.pow(b,2)-(4*a*c);
		double abs=Math.sqrt(Math.abs(delta));
		root1=(-b+abs)/(2*a);
		root2=(-b-abs)/(2*a);
		
		System.out.println(delta);
		System.out.println(root1);
		System.out.println(root2);
	}
}
