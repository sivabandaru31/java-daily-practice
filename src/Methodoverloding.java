public class Methodoverloding {
   static int  calculator(int a,int b){
        return a+b;
    }
    static double calculator(double a,double b){
      return a*b;
    }
    static int calculator(int a,int b,String str){
       switch(str){
           case "+":return a+b;
           case "-":return a-b;
           case "*":return a*b;
           case "/":
               if(b==0){
                   System.out.println("error division by zero is undefind ");
                   return -1;
               }
               return a/b;
           default:
           System.out.println("not a valid operation");
           return -1;

       }

    }
    public static void main(String[] args) {
        System.out.println(calculator(2,3));
        System.out.println(calculator(2.5,2.5));
        System.out.println(calculator(1,2,"+"));
        System.out.println(calculator(2,1,"-"));
        System.out.println(calculator(1,2,"*"));
        System.out.println(calculator(2,0,"/"));


    }
}
