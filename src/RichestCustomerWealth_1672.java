import java.util.Scanner;

public class RichestCustomerWealth_1672 {
    public static void input(int[][] accounts,Scanner sc,int rows,int cols){
        System.out.println("enter array elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                accounts[i][j]=sc.nextInt();
            }
        }
    }
    public static void richestCustomerWealth(int[][] accounts ,int rows,int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                //System.out.print(accounts[i][j]+ " ");
                if(accounts[i][j]==3){
                    System.out.println(i+" "+j);
                }
            }
            System.out.println();
        }
    }
//    public static void display(int[][] accounts){
//        int rows=accounts.length;
//        int cols=accounts[0].length;
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                System.out.print(accounts[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
public static void inverse(int[][] accounts,int rows,int cols){
    for(int j=0;j<rows;j++){
        for(int i=0;i<cols;i++) {
            System.out.print(accounts[i][j] + " ");
            if (j % 2 == 0) {
                System.out.print(accounts[i][j] + " ");
            }
        }
        for(int i=rows-1;i>=0;i--){
            if (j % 2 != 0) {
                System.out.print(accounts[i][j] + " ");
            }
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows:");
        int rows=sc.nextInt();
        System.out.println("enter coloms");
        int cols=sc.nextInt();
        int[][] accounts=new int[rows][cols];
        input(accounts,sc,rows,cols);
        richestCustomerWealth(accounts,rows,cols);
        //display(accounts);
        inverse(accounts,rows,cols);
    }
}
