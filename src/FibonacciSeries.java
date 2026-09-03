import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n;

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        n=scanner.nextInt();
        int num1=0,num2=1;
        System.out.println("the fibonacci series"+num1+ ""+num2);
        int nextnumber=0;
        for(int i=3;i<=n;i++){
            nextnumber=num1+num2;
            System.out.println(nextnumber);
            num1=num2;
            num2=nextnumber;
            //System.out.println(nextnumber);
        }
        //System.out.println(nextnumber);
    }
}
