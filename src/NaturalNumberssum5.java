import java.util.Scanner;

public class NaturalNumberssum5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("enter number");
        n=scanner.nextInt();
        int num=0;
        for(int i=1;i<=n;i++){
            num+=i;

        }
        System.out.println(num);

    }
}
