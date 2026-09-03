public class Array2 {
    public static void main(String[] args) {
        int[][] myarray=new int[2][];
         myarray[0]=new int[]{'a','b'};
         myarray[1]=new int[]{'c','d','e'};
         for(int[] num:myarray){
             for(int arr:num){
                 System.out.print(arr+" ");

             }
             System.out.println();

         }

    }
}
