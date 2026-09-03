import java.util.Scanner;

public class diagonal {
    public static void input(int[][] arr,Scanner sc, int m,int n){
        System.out.println("enter elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static void bionamilDifferenc(int[][] arr,int m,int n){
        int primary=0;
        int secondary = 0;
        for(int i=0;i<m;i++) {
            primary += arr[i][i];
            secondary += arr[i][m - 1 - i];

//            int l = arr.length - 1;
//            for (int j = l; j > 0; j--) {

           // }
        }
        int differenc;

        if(primary>secondary){
            differenc=primary-secondary;
        }else{
            differenc=secondary-primary;
        }

        System.out.println(differenc);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row size:");
        int m=sc.nextInt();
        System.out.println("enter colom size:");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        input(arr,sc,m,n);
        bionamilDifferenc(arr,m,n);

    }
}
