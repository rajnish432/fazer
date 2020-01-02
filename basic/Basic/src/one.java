import java.util.*;
public class one {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        if(name.length()>3)
        {
            System.out.println("hello "+name+", How are you?");
        }
        else
        {
            System.out.println("Less then 3 alphabets entered");
        }
        
    }
    
}
