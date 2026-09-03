public class Nestedforloop3 {
    public static void main(String[] args) {
              /*  for(int i=0;i<=5;i++){//repersents number of row's
                    for(int j=0;j<=5;j++){//repersents number of colomn's
                        System.out.print("*"+ " ");
                    }
                    System.out.println();//line by line
                    for(int i=0;i<=5;i++){//repersents number of row's
            for(int j=0;j<=5;j++){//repersents number of colomn's
                System.out.print("*"+ " ");
            }
            System.out.println();//line by line
            Sc


                }*/

        /*for (int i = 0; i <= 5; i++) {//*****   ****  ***  **  *
            for (int j = i; j <= 5; j++) {
                System.out.print("*");


            }
            System.out.println();
        }*/
        for(int i=1;i<=5;i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j=5;j>=i;j++){
                System.out.print(" *");
            }


            System.out.println();
        }


    }
}



