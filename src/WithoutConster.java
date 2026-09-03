public class WithoutConster {
    int a;
    int b;

    public int getsum() {
        return a + b;

    }
}
    class cons{
        public static void main(String[] args) {
            WithoutConster a1=new WithoutConster();
            a1.a=10;
            a1.b=20;
            System.out.println(a1.getsum());
        }
    }


    //public static void main(String[] args) {






