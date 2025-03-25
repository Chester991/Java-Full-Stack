public class A3Float {
        public static void main(String[] args) {
            int x = 9/2;
            System.out.println(x); // output = 4
            System.out.println(9/2); // output = 4
            System.out.println(9/2f); // output = 4.5
            //  2 will be treated by java as a floating point number (f = float)
            System.out.println(9/2d); // d = double

            // When we write
            // float num = 1.1 by default it will give error java will treat it as a double
            // we have to explicitly specify that it is a floating point number
            float num = 1.1f;
            System.out.println(num);
        }
}
