public class MethodAreaofcircle {
    static double areas(double radious) {
        double area = Math.PI * radious;
        double circumference = 2 * Math.PI * radious;
        System.out.println(area);
        System.out.println(circumference);
        return area;

    }
    static void greeting(String name,String timeofday){
        System.out.println("Hello  "    +name +  "  good "+timeofday);
    }
    static  double   calculateprice(int quantity,double price,boolean ismember){
        double totalprice=quantity* price;
        if(ismember){
            totalprice-=totalprice*0.15;
            System.out.println(totalprice);

        }
        return totalprice;

    }
    static void squareofnumber(int number){
        int squareroot=number*number;
        System.out.println(squareroot);
    }


    public static void main(String[] args) {
        //areas(1.2);
        //greeting("neelima","morning");
        //calculateprice(3,120.0,true);
        squareofnumber(5);


    }
}
