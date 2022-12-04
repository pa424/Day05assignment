
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args){
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);

        int headCount = 0;
        int tailCount = 0;

        int count = sc.nextInt();
        System.out.println("----flipcoin-----");

        for(int i = 0;i< count;i++){
            double random = Math.random();
            if(random < 0.5)
                tailCount++;
            else
                headCount++;
        }
        System.out.println("percentage of tails(" + tailCount +"):"+(tailCount*100.0/(headCount + tailCount)));
        System.out.println("percentage of heads(" + headCount + ")::"+(headCount*100.0/(headCount + tailCount)));
    }
}
