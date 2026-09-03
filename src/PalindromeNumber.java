import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("enter number");
        num=scanner.nextInt();
        int originalnumber=12321;
        int reversenumber=0;
        for(;num!=0;num/=10){
            int reminder=num%10;
            reversenumber=reversenumber*10+reminder;
            //System.out.println(reversenumber);
        }if(originalnumber==reversenumber){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }

    }
    
}
