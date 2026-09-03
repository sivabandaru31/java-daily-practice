public class MethodMulticationtable {
    static  void multiplicationtable(int a){
        for(int i=1;i<=10;i++){
            int num=a*i;
            System.out.println(a+ "*" +i+ "=" +num);
            return;
        }


    }
    static void primenumber(int num){
        if(num%2!=0){
            System.out.println("prime number");
            return;
        }
        System.out.println("not a prime number");
    }

    public static void main(String[] args) {
        multiplicationtable(5);
        primenumber(2);
        primenumber(8);
        primenumber(11);

    }

}
