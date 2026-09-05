import java.util.Scanner;

public class MethodeDemo {
   static  int addition(){//defination of method
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("enter first number :");
        num1=sc.nextInt();
        System.out.println("enter second number :");
        num2=sc.nextInt();
        int sum=num1+num2;
        //System.out.println("sum :"+sum);
        return sum;
    }
    public static void main(String[] args) {
        addition();
        addition();
        addition();
        addition();
        addition();
        addition();
        addition();
        addition();
        addition();
        addition();


    }
}
