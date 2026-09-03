import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int sumeven=0;
        for(int i=0;i<=num;i++){
            if(i%2==0){
                sumeven+=i;
            }
        }
        System.out.println(sumeven);
    }
}
