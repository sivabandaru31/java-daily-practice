import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        num=scanner.nextInt();
        if(num<=1){
            System.out.println("invalid number");
        }else {
            int fact=1;


            for (int i = num; i >= 1; i--) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}
