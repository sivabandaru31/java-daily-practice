import java.util.HashMap;

public class RemoveDuplecatesDemo {


//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            //map.put(arr[i],1);
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        //System.out.println(map.keySet());
//        System.out.println(map);
        public static void removeduplecates(int[] arr) {
            int left = 1;
            for (int right = 1; right < arr.length; right++) {
                if (arr[right] != arr[left]) {
//                    int temp = arr[left];
//                    arr[left] = arr[right];
//                    arr[right] = temp;
                    arr[left]=arr[right];
                    left++;
                }
            }
            int count =0;
            for(int i=0;i<left;i++){
                //System.out.print(arr[i]+" ");
                count++;


            }
            System.out.println(count);
        }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,56,4,6,4};
        removeduplecates(arr);
    }
}
