import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.*;

public class binarysearch
{ 

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the word to search: ");
		String str=sc.nextLine();
		String[] search = null;
	    
	
		
		
		try 
		{
			
			BufferedReader bir=new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\practice\\binary.txt"));
			String words;
			
			while((words=bir.readLine())!=null)
			{
				search=words.split(" ");
				Arrays.parallelSort(search);
			}
			
			for(int i=0;i<search.length;i++)
			{
			System.out.println(search[i]);
			}
			int n=search.length;
			int max=n-1;
			int min=0;
			int mid=0;

		while(min<=max)
		{
		     mid=max-min/2;

			
			if(search[mid].compareTo(str)==0)                  //word is at middle;
			{
				System.out.print("words found at: "+mid);
				break;
			}
			else
			{
			if(search[mid].compareTo(str)==-1)                 //string is not in left half;
			{
			  min=mid+1;
			}
			else                     //string is not in right half;
			{
				max=mid-1;
			}
			}
			
		}
			
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
	}
		}


