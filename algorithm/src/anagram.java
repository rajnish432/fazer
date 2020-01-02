import java.util.Scanner;

public class anagram {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String st1=sc.nextLine();
		String st2=sc.nextLine();
		
		int a=st1.length();
		int b=st2.length();
		int found=0;
		
		if(a==b)              //check-length
		{
		  int len=a;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(st1.charAt(i)==st2.charAt(j))          //check strings char
				{
					found=1;
					break;
				}
				else
				{
					found=0;
					break;			
				}
			}
		}
			
		if(found==1)               //if found print 
		{
			System.out.println("it is a anagram");
		}
		else
		{
			System.out.print("not a anagram");
		}
		}
		else
		{
			System.out.print("length is not equal");
		}
	}

}
