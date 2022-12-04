
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args)
    {
        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        //condition for checking year entered by user is a leap year or not
        if((year%4 == 0 && year % 100 !=0)||year%400 ==0){
            System.out.println("Is a leap year" + year);
        }else{
            System.out.println("is not a leap year"+year);
        }

    }
}
