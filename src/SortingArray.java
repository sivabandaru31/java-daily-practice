import java.util.Arrays;
public class SortingArray {
    static void Sorting(int[] arr){
        int next=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>next){
                next=arr[i];
                System.out.println(next);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,4,5,69,73,74,2,4,9,83};
        Sorting(arr);
    }
}
