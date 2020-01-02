import java.util.*;

public class coin 
{
    public static void main(String[]args)
    { int head=0,tails=0;
        int poh=0;
        int pot=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of times to toss coin: ");
        int times=sc.nextInt();
        
        for(int i=0;i<times;i++)
        {
            if(Math.random()<0.5)
            {
                tails++;
            }
            else
            {
               head++;
            }
        }
        
        poh=(head*100)/times;
        pot=(tails*100)/times;
        
        System.out.println("Number of times heads: "+head);
        System.out.println("Number of times tails: "+tails);
        System.out.println("percentage of haeds: "+poh+"%");
        System.out.println("percentage of tails: "+pot+"%");
    }
}
