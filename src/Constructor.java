public class Constructor {
    int x;
    int y;
    int total;

    Constructor() {
        x = 10;
         y = 20;

    }
        void sum () {

            total = x + y;
            System.out.println(total);
        }



            public static void main(String[] args) {
                Constructor c1 = new Constructor();
                c1.sum();

            }


}






