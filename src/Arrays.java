import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
       // int[] marks={1,2,3,4,5};
       // int [] marks=new int [5];
         //double={1,2,3,4,5};
        //int[] marks=new int[]{1,2,3,4,5};
        //System.out.println(marks[1]);
        int[] numbers=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of elements:");
        for(int i=0;i< numbers.length;i++){
             numbers[i]=scanner.nextInt();
        }
        for(int i=0;i< numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}
