import java.util.Scanner;
import java.util.Arrays;
public class ChangePositions {
//    public static  void input(int[] arr ,Scanner sc){
//        System.out.println("enter array elements");
//        for(int i=0 ;i< arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//    }
//    public  static void movePositions(int[] arr){
//        int n=arr.length-1;
//        int i = 0;
//        while (i < n) {
//            if (arr[i] % 2 == 0) {
//                int temp = arr[n];
//                arr[n] = arr[i];
//                arr[i] = temp;
//                n--;
//            } else {
//                i++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void sort(int[] arr){
//        int start = 0;
//        while (start < arr.length && arr[start] % 2 != 0) {
//            start++;
//        }
//        Arrays.sort(arr, start, arr.length);
//
//        //System.out.println("After sorting even numbers:");
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter array size");
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        input(arr,sc);
//        movePositions(arr);
//        sort(arr);
//
//    }
//}


//import java.util.*;
//public class lec6{
    public static Scanner scn = new Scanner(System.in);

    public static int[] input(int n){
        int[] arr = new int[n] ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }


    public static int[] oddLeftEvenRyt(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] *= -1;
            }
        }

        Arrays.sort(arr);

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] < 0) {
        //         arr[i] *= -1;
        //     }
        // }

        int idx = 0;
        while(arr[idx] < 0) {
            arr[idx] *= -1;
            idx++;
        }

        return arr;
    }

    public static void main(String[] args){
        display(oddLeftEvenRyt(input(scn.nextInt())));
    }
}

// 6 3 9 0 4 2 10 8 7