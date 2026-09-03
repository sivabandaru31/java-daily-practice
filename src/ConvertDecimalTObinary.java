import java.util.Scanner;

public class ConvertDecimalTObinary {
    public static int  decimalTobinary(int n,Scanner sc){
        int pow=1;
        int ans=0;
        while (n!=0){
           int rem=n%2;
            n/=2;
            ans+=rem*pow;
            pow*=10;
        }
        return  ans;
    }
    public static int binaryTobinary(int n,Scanner sc){
        int pow=1;
        int ans=0;
        while(n!=0){
            int rem=n%10;
            n/=10;
            ans+=rem*pow;
            pow*=2;
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
       int result= decimalTobinary(n,sc);
        System.out.println(result);
       int result2= binaryTobinary(n,sc);
        System.out.println(result2);

    }
}
