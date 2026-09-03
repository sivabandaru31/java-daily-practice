public class Foreachfor {
    public static void main(String[] args) {
        char[] charectors={'a','n','s','t','b','n','a'};
        int target='a';
        int count=0;
        for(char  ch:charectors){
            if( ch == target){
                count++;

            }
        }
        System.out.println(count);

    }
}
