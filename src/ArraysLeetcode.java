import java.util.Arrays;
import java.util.Collections;

public class ArraysLeetcode {
    static void reversearray(int[] yourarray){
       int rightindex=yourarray.length-1;
       int halfindex=yourarray.length/2;
       for(int i=0;i<halfindex;i++){
          int temp=yourarray[rightindex];
          yourarray[rightindex]=yourarray[i];
          yourarray[i]=temp;
          rightindex--;

       }
        System.out.println(Arrays.toString(yourarray));

    }
    public static void main(String[] args) {
       // Integer[] arr={1,2,3,4,5,6};
        //Arrays.sort(arr,Collections.reverseOrder());
        //System.out.println(Arrays.toString(arr));
        //String[] myarray1={"neelima","sivakrishna","bhargav","asritha"};
        //Arrays.sort(myarray1, Collections.reverseOrder());
        //System.out.println(Arrays.toString(yourarray));
        //System.out.println(Arrays.toString(myarray1));
        //Integer[] arr = {4, 2, 9, 1, 5};
        //Arrays.sort(arr, Collections.reverseOrder());
        //System.out.println(Arrays.toString(arr));
       /* int[]myarray={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(myarray));
        for(int i= myarray.length-1;i>=0;i--){
            //System.out.println(Arrays.toString(myarray[i]+" "));
            System.out.print(myarray[i]+" ");
        }
        //System.out.println();*/
        int[]myarray={1,2,3,4,5};
        reversearray(myarray);

    }
}
