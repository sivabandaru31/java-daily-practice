import java.util.Arrays;
public class SumOfTwoArrays {
    public static void sumofTwoArrays(int[] arr1 ,int[] arr2){
        int[] k=new int[Math.max(arr1.length,arr2.length)];
        System.out.println(Arrays.toString(k));
        int length1=arr1.length-1;
        int length2=arr2.length-1;
        int i=length1;
        int j=length2;
        int div=0;
        while(length1>0){
           int sum=arr1[i]+arr2[j]+div;
           if(sum>9){
               int mod=sum%10;
               arr1[length1]=sum;
               div=sum/10;
               i--;
               j--;
           }
           arr1[length1]=sum;
            length1--;

        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void subraction(int[] arr1,int[] arr2){

    }
    public static void main(String[] args) {
        int[] arr1={6,3,9,5,6,1};
        int[] arr2={4,2,9,0,8};
        sumofTwoArrays(arr1,arr2);

    }
}
