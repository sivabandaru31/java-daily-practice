import java.util.Scanner;

public class Whilepractice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number\n1:addition\n2:multiplication\n3:multiplication\n4:division\n5:module");
        int num;
        int a=5;
        int b=5;
        int choice;
        num=scanner.nextInt();
        if(num>=5){
            System.out.println("invalid choice");
        }
        while(num==1) {
            int add = a + b;
            System.out.println(add);
            break;
        }if(num==2){
            int sub=a-b;
            System.out.println(sub);
        }if(num==3){
            int mul=a*b;
            System.out.println(mul);
        }if(num==4){
            int div=a/b;
            System.out.println(div);
        }if(num==5){
            int mod=a%b;
            System.out.println(mod);

        }
        System.out.println("valid choice");

    }
}
