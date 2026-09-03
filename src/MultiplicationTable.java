import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.print("enter the number");
        num=scanner.nextInt();
        int result=0;
        for(int i=1;i<=10;i++){
        result=num*i;
            System.out.println(num+"*"+i+"="+result);
        }
       // System.out.println(result);
    }
}
