import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=1;
        int nsp=n-1;
        for(int row =1;row<=n;row++){
            int val=row;
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("\t");
            }
            for(int cst=1;cst<=nst;cst++){
                if(cst<=nst/2){
                    System.out.print(val++  +"\t");
                }else{
                    System.out.print(val--  +"\t");
                }
            }
            nst+=2;
            nsp--;
            System.out.println();
        }
    }
}
