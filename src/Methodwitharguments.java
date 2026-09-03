import java.util.Scanner;

public class Methodwitharguments {
    /*static int addition(int a,int b){
        int sum=a+b;
       return sum;
        //System.out.println("");
        // System.out.println(sum);

    }*/
    static void addition(int a,int b) {
        int sum = a + b;
        System.out.println(sum);
        return;
    }


    public static void main(String[] args) {
       // System.out.println("the sum is:"+addition(2,3));
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter firest number:");
       int  a=scanner.nextInt();
        System.out.println("enter second number:");
       int b=scanner.nextInt();
       addition(a,b);
        //System.out.println(addition(a,b));
        System.out.println("program is over");

    }
}
