import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ContainsDuplicateUsingHashMap {
        public static boolean findDuplicates(int[] nums) {

            HashMap<Integer, Integer> map = new HashMap<>();
            List<Integer> result = new ArrayList<>();

            // Count frequency
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int num : nums) {
                if (map.get(num) == 2) {
//                    result.add(num);
//                    map.put(num, 0);
                    return true;
                }
            }

            return false ;
        }

        public static void main(String[] args) {

            int[] nums = {4, 3, 2, 7, 8, 0, 6, 1};
            ContainsDuplicateUsingHashMap obj = new ContainsDuplicateUsingHashMap();
            boolean result = obj.findDuplicates(nums);
            System.out.println(result);

            //List<Integer> result = obj.findDuplicates(nums);
//            System.out.println("Array: " + Arrays.toString(nums));
//            System.out.println("Duplicates: " + result);
        }

}
