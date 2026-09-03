public class LeetcodeArrays {
    static void sumarr(int[] yourarray,int num) {
        for (int i=0;i<yourarray.length;i++){
            for(int j=i+1;j<yourarray.length;j++){
                if(num==yourarray[i]+yourarray[j]){
                    System.out.println("i="+i+"j="+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]myarray={2,7,11,3,1};
        int target=9;
        sumarr(myarray,target);

    }
}
