import java.util.Scanner;

public class HakarrankFindDigits {
    public static int findDgiditd(int n){
        int temp=n;
        int count=0;
        int rem=0;
        while(temp!=0) {
             rem=temp%10;
            if (rem!=0 && n % rem==0 ){
                count++;
            }
            temp = temp / 10;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Emter input");
        int n=sc.nextInt();
        int result=findDgiditd(n);
        System.out.println(result);
    }
}
