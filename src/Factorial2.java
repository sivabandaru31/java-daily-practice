import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.print("enter number");
        num=scanner.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("factorial of numberis="+fact);

    }
}
