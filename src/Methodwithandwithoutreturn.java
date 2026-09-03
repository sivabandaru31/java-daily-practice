public class Methodwithandwithoutreturn {
    static double addition(double a,double b){
        int sum=(int)(a+b);
        return sum;

    }
    static double average(double a,double b){
        double c=addition(a,b);
        return c/2;
    }

    public static void main(String[] args) {
        System.out.println(addition(2,3));
        System.out.println(average(3,4));
    }

}
