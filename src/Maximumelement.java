public class Maximumelement {
    public static void main(String[] args) {
       int[] arr={9,2,3,4,5,6,7,9};
       int max=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
        System.out.println(max);
    }
}
