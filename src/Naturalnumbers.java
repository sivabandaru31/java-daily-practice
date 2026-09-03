import java.util.Scanner;

public class Naturalnumbers {
    public static void main(String[] args){
        int n;
        System.out.println("enter n value");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
        sum+=i;
        }
        System.out.println(sum);


    }
}
