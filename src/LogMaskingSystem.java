import java.util.Scanner;
public class LogMaskingSystem {
    public static void maskPhoneNumber(String log){
        StringBuilder sb=new StringBuilder(log);
         for(int i=0;i<=sb.length()-10;i++){
             boolean isphone=true;

             for(int j=i;j<i+10;j++){
                 if(!Character.isDigit(sb.charAt(j))){
                     isphone=false;
                     break;
                 }
             }
             if(isphone){
                 for(int j=i;j<i+6;j++){
                     sb.setCharAt(j,'*');
                 }
                 break;
             }
         }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your message");
        String log=sc.nextLine();
        maskPhoneNumber(log);
        sc.close();


    }
}
