import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class unordered<T>
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the word to be searched");
		String search=sc.nextLine();
		List<String> al=new ArrayList<String>();
		
		try 
		{
			FileReader fr=new FileReader("C:\\Users\\User\\Desktop\\practice\\binary.txt");
			BufferedReader br=new BufferedReader(fr);
			String str=" ";
			
			while((str=br.readLine())!=null)
			{
				String[] spliter=str.split(" ");
				al=Arrays.asList(spliter);
			}
			System.out.println(al); 
			
			for(int i=0;i<al.size();i++)
			{
				if(al.get(i).compareTo(search)==0)
				{
					System.out.print("Word found at: "+al.indexOf(i));
					al.remove(al.get(i));
					System.out.println(al);
				}
				else
				{
					
					al.add(search+" ");
				}
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}

}
