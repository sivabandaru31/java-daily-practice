public class NewArrays {
    static int sumofnaturalnumbers(int n){
//        int n=5;
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            sum=sum+i;
//        }
//        return sum;
        int sum=n*(n+1)/2;
        return sum;

    }
    static int factorial(int n){
        int i=1;
        int fact=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        return fact;
    }
    static void  MultiplicationTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" *"+i+"="+(n*i));
        }
    }
    static void primenumber(int n){
        if(n<=1) {
            System.out.println("given number is not prime");
        }
        boolean isprime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime=true){
            System.out.println("is prime number");
        }else{
            System.out.println("not prime");
        }

    }
    public static void main(String[] args) {
        int n=5;
//       int result= sumofnaturalnumbers(n);
//        System.out.println("sum "+result);
//        int result=factorial(n);
//        System.out.println(result);
//
        primenumber(n);
    }
}
