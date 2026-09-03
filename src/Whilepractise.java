import java.util.Scanner;

public class Whilepractise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("enter number 1 to 50:");
        num=scanner.nextInt();
       // System.out.println("enter number");
        while(num<=1 || num<=50){
            System.out.println("thanks");
            //num=scanner.nextInt();//giving multiple inputs
            break;//only one input
        }
        //num=scanner.nextInt();
        System.out.println(" invalid number \n pleace enter valid number");
    }
}
