
import java.util.Scanner;
public class Factors {
    public static void main(String[] args){
        System.out.println("Taking number from user to find out their factor");
        Scanner sc = new Scanner(System.in);
        int factorNumber = sc.nextInt();
        for(int i=2; i<= factorNumber;i++){
            if(factorNumber %i ==0)
                System.out.print(i + "\t");
        }
    }
}
