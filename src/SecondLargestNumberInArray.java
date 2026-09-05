public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7};
       int largest=0;
       int j=arr[0];
       int secondlargest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[j]){

                 largest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondlargest);
    }
}
