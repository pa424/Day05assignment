import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args){
        char ch;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter an Alphabet:");
        ch=scan.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='u'||ch=='U'){
            System.out.print(ch+ "is vowel");
        }
        else {
            System.out.print(ch+ "is constant");
        }
    }
}
