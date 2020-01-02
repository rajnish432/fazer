import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class vending1 {

	static int note[]= {1000,500,100,50,10,5,2,1};
	static int i=0;
	static int total=0;
	
	static int calculate(int money,int note[])
	{
		int rem;
		if(money==0)
		{
			return -1;
		}
		else
		{
		if(money>=note[i])
		{
			int calcnotes=money/note[i];
			rem=money%note[i];			
			money=rem;
			total+=calcnotes;
			System.out.println(note[i]+"notes are: "+calcnotes);	
		}
		i++;
		return calculate(money, note);
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int amount=sc.nextInt();
		vending1.calculate(amount, note);
		System.out.println("Total number of notes are: "+total);
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
