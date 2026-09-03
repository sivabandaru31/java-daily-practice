import java.util.Scanner;

public class CountWords {
//    public static String countWords(String str , Scanner sc){
//
//
//    }
    public static int countCharacters(String str){

        int count=0;
       for(int i=0;i<str.length();i++){
           count++;
       }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  String");
        String str = sc.nextLine();
       int result= countCharacters(str);
        System.out.println(result);

    }
}
