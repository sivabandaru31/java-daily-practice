import java.util.Scanner;

public class EvenNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("enter number N:");
        num = scanner.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                System.out.println("even number");
                break;
            }
                //System.out.println("not even number");
            }
            System.out.println("prime number");

        }
        //System.out.println("not even number");
    }








