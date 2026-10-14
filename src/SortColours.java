
import java.util.Arrays;
public class SortColours {
    public static void sortcolours(int[] nums){
        int countzero=0;
        int countone=0;
        int counttwo=0;
        int n=nums.length;

        for (int i=0;i<n;i++){
            if(nums[i]==0){
                countzero++;
            }else if(nums[i]==1){
                countone++;
            }else{
                counttwo++;
            }
        }
//        System.out.println(countzero);
//        System.out.println(countone);
//        System.out.println(counttwo);

        int i=0;
        while(countzero>0){
            nums[i]=0;
            i++;
            countzero--;
        }


        int j=i;
        while(countone>0){
            nums[j]=1;
            j++;
            countone--;
        }
        int k=j;
        while(counttwo>0){
            nums[k]=2;
            k++;
            counttwo--;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums={1,1,0,2,0,1,2,0,2};
        sortcolours(nums);
    }
}
