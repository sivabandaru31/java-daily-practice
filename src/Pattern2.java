import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input: ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            //int val=row;
            for (int col = 1; col <= row; col++) {
                int val = col;
                System.out.print(val + "\t");
            }
                System.out.println();
        }
    }
}
