import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args){
        System.out.println("Harmonic Number:");
        Scanner sc = new Scanner(System.in);

        double harmonicSum = 0.0;
        int count = sc.nextInt();

        for(int i=1; i <= count; i++) {
            if (i < count) {
                System.out.println("1/" + i + "+");
            }else {
                System.out.println("1/" + i);

            }

        }
        System.out.println();
        System.out.println("Harmonic Number" + harmonicSum);
    }
}
