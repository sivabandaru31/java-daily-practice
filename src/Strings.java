import java.util.Scanner;

public class Strings {
    public static boolean palindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void allPalindromesinstring(String str){
        StringBuilder sb=new StringBuilder(str);
        //sb.charAt(0);
        int left=0;
        int right=str.length()-1;
        int i = 0;
        while(left!=right){
            i++;
            System.out.println(sb.substring(0, i));
            left++;
        }
    }
    public static void allPalindromesInString(String str){
        for(int i=0;i<str.length()-1;i++){
            for(int j=i;j<str.length()-1;j++){
                String sub=str.substring(i,j);
                if(palindrome(sub)){
                    System.out.println(sub);
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  String");
        String str=sc.nextLine();
//        Boolean result=palindrome(str,sc);
//        System.out.println(result);
       // palindrome(str);
        allPalindromesinstring(str);


    }
}
