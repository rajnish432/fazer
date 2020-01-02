import java.util.*;
import java.math.*;

public class euclidian
{
	public static void main(String[]args)
	{
		double x=Integer.parseInt(args[0]);
		double y=Integer.parseInt(args[1]);

		double distance=Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
		System.out.println("distace is: "+distance);
	}
}
