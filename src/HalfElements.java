import java.util.Scanner;

public class HalfElements {
    public static void input(int[][] arr, Scanner sc, int m, int n){
        System.out.println("enter elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static void halfElements(int[][] arr,int m,int n){
        int l=-1;
        for(int i=0;i<m;i++){
            ++l;
            for (int k = 0; k < i; k++) {
                System.out.print("   ");
            }
            for(int j=l;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size:");
        int m = sc.nextInt();
        System.out.println("enter colom size:");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        input(arr, sc, m, n);
        halfElements(arr,m,n);
    }
}
