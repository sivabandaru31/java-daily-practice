import java.util.Scanner;

public class MethodDemo {
        static int addition() {//with return type without arguments
        //public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            int num1, num2;
            System.out.println("enter firest number:");
            num1 = scanner.nextInt();
            System.out.println("enter second number: ");
            num2 = scanner.nextInt();
            int sum = num1 + num2;
            //System.out.println(sum);
            return sum;//return is optional because we given void
        }

        public static void main(String[]args) {
         // int result = addition();
            System.out.println(addition());
            //addition();
            //addition();



        }
}




