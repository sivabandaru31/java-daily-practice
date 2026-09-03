import java.util.Scanner;

public class Dowhileloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        do{

            System.out.println("entere number 1 to 50:");
            num= scanner.nextInt();
            if(num<1 || num<50){
                System.out.println("your entred "+num+"and this is valid number");
            }

        }while(num<1 || num<50);
        System.out.println("invalid number");
        System.out.println("enter number 1 to 50:");
        num=scanner.nextInt();
    }
}
