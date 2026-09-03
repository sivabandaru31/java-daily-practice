import java.util.Scanner;
import  java.util.Arrays;
public class SprialPrinting {
//    public static Scanner scn = new Scanner(System.in);
//
//    public static int[] input(int n) {
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scn.nextInt();
//        }
//        return arr;
//    }
//
//    public static void display(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//        System.out.println();
//    }
//
//    public static int[] oddLeftEvenRyt(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                arr[i] *= -1;
//            }
//        }
//
//        Arrays.sort(arr);
//
//        // for (int i = 0; i < arr.length; i++) {
//        // if (arr[i] < 0) {
//        // arr[i] *= -1;
//        // }
//        // }
//
//        int idx = 0;
//        while (arr[idx] < 0) {
//            arr[idx] *= -1;
//            idx++;
//        }
//
//        return arr;
//    }
public static void input(int[][] arr,Scanner sc,int m, int n) {
        //int[] arr = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void stateOfWakanda5Spiral(int[][] arr) {
        int n = arr.length, m = arr[0].length, tnel = n * m;
        int rmin = 0, rmax = n - 1;
        int cmin = 0, cmax = m - 1;

        while (tnel > 0) {
            for (int r = rmin; r <= rmax && tnel > 0; r++) {
                System.out.print(arr[r][cmin] + " ");
                tnel--;
            }
            System.out.println();
            cmin++;

            for (int c = cmin; c <= cmax && tnel > 0; c++) {
                System.out.print(arr[rmax][c] + " ");
                tnel--;
            }
            System.out.println();
            rmax--;

            for (int r = rmax; r >= rmin && tnel > 0; r--) {
                System.out.print(arr[r][cmax] + " ");
                tnel--;
            }
            System.out.println();
            cmax--;

            for (int c = cmax; c >= cmin && tnel > 0; c--) {
                System.out.print(arr[rmin][c] + " ");
                tnel--;
            }
            System.out.println();
            rmin++;
        }
        Arrays.toString(arr);

    }

    public static void main(String[] args) {
        //display(oddLeftEvenRyt(input(scn.nextInt())));
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row size");
        int m=sc.nextInt();
        System.out.println("enter colom size");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        input(arr,sc,m,n);
        stateOfWakanda5Spiral(arr);

    }
}
