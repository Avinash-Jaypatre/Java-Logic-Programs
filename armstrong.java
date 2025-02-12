package Logic;
import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter number :");
        int num = sc.nextInt();

        int length = 0;
        int t1 = num;

       
        while (t1 != 0)
        {
            length++;
            t1 = t1 / 10; 
        }

        int arm = 0;
        t1 = num;

        while (t1 != 0) 
        {
            int rem = t1 % 10; 
            int mal = 1; 
            
            for (int i = 0; i < length; i++)
            {
                mal = mal*rem; 
            }

            arm = arm+mal;
            t1 = t1 / 10; 
        }

        if (arm == num) 
        {
            System.out.println("This is an Armstrong number..!");
        } else
        {
            System.out.println("This is not an Armstrong number..!");
        }
    }
}
