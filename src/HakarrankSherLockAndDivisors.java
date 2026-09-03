import java.util.Scanner;

public class HakarrankSherLockAndDivisors {
    public static int sherLockAndDivisor(int n){
        int count=0;
        int temp=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0 && i%2==0){
                count++;
            }
            int others=n/i;
            if(others!=i && others%2==0){
                count++;
            }


        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input: ");
        int n=sc.nextInt();
      int result=  sherLockAndDivisor(n);
        System.out.println(result);
    }
}
