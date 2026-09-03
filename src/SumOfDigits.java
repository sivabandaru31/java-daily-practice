import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num=scanner.nextInt();
        int sumofdigits=0;
        for(;num!=0;num/=10){
            int reminder=num%10;
            sumofdigits=sumofdigits+reminder;
            //System.out.println(sumofdigits);
        }
        System.out.println(sumofdigits);
    }
}
