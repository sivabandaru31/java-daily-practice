import java.util.Scanner;

public class Dwhilepractise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n****************************");
            System.out.println("Welcome to my calculator! \uD83E\uDDEE");
            System.out.println("******************************");
            System.out.println("1:Addition");
            System.out.println("2:Subtraction");
            System.out.println("3:Multiplication");
            System.out.println("4:Division");
            System.out.println("5:Module");
            System.out.println("enter your choice(1-6):");
            choice=scanner.nextInt();
            switch(choice) {
                case 1:
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println("Addition"   +      (num1 + num2));
                    break;

                case 2:
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    System.out.println("Subtraction" + (num1 - num2));
                    break;

                case 3:
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    System.out.println("enter firest number" + num1 + "second number" + num2 + "Multiplication" + +(num1 * num2));
                    break;

                case 4:
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    System.out.println("enter firest number" + num1 + "second number" + num2 + "Division" + (num1 / num2));
                    break;


                case 5:
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    System.out.println("enter firest number" + num1 + "second number" + num2 + "Module" + (num1 % num2));
                    break;
            }






        }while(choice<=5);{
            System.out.println("invalid choice");
        }
    }
}
