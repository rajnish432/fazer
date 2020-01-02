import java.util.*;

public class bubble 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.print("Enter the integers: ");
		
		for(int i=0;i<num;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.print(al);
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)>al.get(j))
				{
					Collections.swap(al, i, j);
				}
			}
			System.out.print(al);
		}
			
	}

}
