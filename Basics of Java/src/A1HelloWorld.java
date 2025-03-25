public class A1HelloWorld {
    //public is a access modifier which means this class can  be used in any other class
    // it is public for everyone .. name of class should be same as program file name
    public static void main(String[] args) {
        // This is a function of type void it returns nothing
        System.out.println("Hello World");
    }
    public static String main1(String[] args) {
        // This is a function of type void it returns nothing
        System.out.println("Hello World 1");
        return "Hello World";
    }
    public static void main2(String[] args) {
        // This is a function of type void it returns nothing
        System.out.println("Hello World 2");
    }

    // How will java know which function to run
}
// The above code is a class HelloWorld now we have to create an object and run a method
// this code gives a static method static means as soon as  main class is created this method
// will automatically go to memory

// Output :- Hello World
// When java compiler compiled this program it gave instruction in byte code
// that we have to create alll methods in our memory
// When we run this class without making any object of this class we have to run main because it is a default method
//which comppler runs as a initial point