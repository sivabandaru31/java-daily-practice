import java.util.Scanner;

public class MultiolicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("enter a number");

        num=scanner.nextInt();
        //System.out.println("enter a number");
       // int result=0;
        for(int i=1;i<=10;i++){
          int   result=num  * i;
            System.out.println(num+"*" +i +"="+result);
        }
        //System.out.println(result);

    }
}
