import java.util.Scanner;

public class WhilePassward {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String mail="sivakrishna";
        String passward;
        do{
            System.out.println("enter passward");
            passward=scanner.nextLine();
            if(!mail.equals(passward)) {
                System.out.println("invalid passward try again ...");
            }

        }while(!(mail.equals(passward)));
        System.out.println("neelima");


    }
}
