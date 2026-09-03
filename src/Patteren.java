import java.util.Scanner;

public class Patteren {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("enter n value");
        n=scanner.nextInt();
        for(int i=0;i<n;i++){
        for(int j=0;j<i;j++) {
            System.out.print("*");
        }
            System.out.println();
        }

    }
}
