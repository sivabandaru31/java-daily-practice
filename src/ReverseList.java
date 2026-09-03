import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
public class ReverseList {


        //List<Integer> list=new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        System.out.println(list.get(0));
//        System.out.println(list);
        //Iterator<Integer> it=list.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//
//
//        }
//        int index=3;
//        int i=0;
//        for(int num:list){
//            if(num==index){
//                System.out.println(num);
//                break;
//            }
//            i++;
//        }
        public static void reverse(List<Integer> arr,int left,int d){
            // left = 0;
            int right = arr.size() - 1;
            while (left < right) {
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
        public static void ksteps(List<Integer> arr,int d){
            int n=arr.size();
             d=d%n;
            reverse(arr,0,d-1);
            reverse(arr,d,n-1);
            reverse(arr,0,n-1);
        }
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5));
            reverse(arr,0,2);
        ksteps(arr,4);
        System.out.println(arr);
    }
}
