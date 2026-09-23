import java.util.Scanner;

public class game {
    public static int game(int num1,int num2,int spynumber,Scanner sc){
        int sum =num1+num2+spynumber;
        int result=sum/2-num2;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("Add second same number");
        int num2=sc.nextInt();
        int spynumber=32;
//        int num1=15;
//        int num2=15;
//        int sum=num1+num2;
//        sum+=32;
//        int result=sum/2-num2;
//        System.out.println(result);
        int result=game(num1,num2,spynumber,sc);
        System.out.println("result :"+result);
    }
}
