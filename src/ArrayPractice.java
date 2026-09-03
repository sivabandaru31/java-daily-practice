import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of rows:");
        int rows = scanner.nextInt();
        System.out.println("number of coloms:");
        int cols = scanner.nextInt();
        int[][] myarray = new int[rows][cols];
        int sum=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //System.out.print(myarray[i][j]);
                myarray[i][j] = scanner.nextInt();
                //System.out.print(myarray[i][j]);

            }

        }
       for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum+=myarray[i][j];
                System.out.print(myarray[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println(sum);
        int maxelement=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(myarray[i][j]>maxelement){
                    maxelement=myarray[i][j];
                }

            }

        }
        System.out.println(maxelement);

    }
}
