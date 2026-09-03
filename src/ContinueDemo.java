import java.util.Scanner;

public class ContinueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        // num=scanner.nextInt();
       /* System.out.println("enter a number");
        num = scanner.nextInt();
        lableIf:
        if (num % 2 == 0) {
            System.out.println("the number is even");
            break lableIf;
        } else {
            System.out.println("the number is odd");
        }*/
        int i;
        lablefor:
        for(i=1;i<=10;i++){
            if(i%2!=0){
                //System.out.println("the number is odd");
                continue lablefor;
            }
            System.out.println(i);
        }
       /* int i;
        lablefor:
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                //System.out.println("the number is odd");
                continue lablefor;
            }
            System.out.println(i);

       */ }
    }



