import java.util.*;
import java.io.*;

public class Arrayout
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		int [][]mat=new int[row1][col1];
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				mat[i][j]+=sc.nextInt();
				
			}
			
		}
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
		
		try
		{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\User\\Desktop\\practice\\rajnish.txt");
		PrintWriter out=new PrintWriter(new OutputStreamWriter(fout));
		out.write(mat+" ");
		out.close();
		fout.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
