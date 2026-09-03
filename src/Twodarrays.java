import java.util.Scanner;

public class Twodarrays {
    public static void main(String[] args) {
        //int[][]marks=new int[][]{{1,1},{2,2}};
       // int[][]marks;
        //marks=new int[][]{{1,1},{2,2}};
        //System.out.println(marks[0][0]);
        //int marks;
        int[][]marks=new int[2][];
        marks[0]=new int[3];
        marks[1]=new int[4];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Elements of Array: ");

        //System.out.println(marks.length);
        for(int i=0;i<marks.length;i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Array["+i+"]["+j+"]:" );
                 marks[i][j] = scanner.nextInt();
                System.out.println(marks);
            }
        }
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }


   }
}