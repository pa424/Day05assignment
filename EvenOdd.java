
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //number%2 == 0 is a valid boolean expression that checks whether number %2 is equivalent to 0.For even number, the result is the value,True.
        if(num % 2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}

