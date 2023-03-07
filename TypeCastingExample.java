public class TypeCastingExample {
    public static void main(String[] args) {
        // Widening casting example
        int myInt = 10;
        double myDouble = myInt;  // Widening casting
        System.out.println( myDouble);  // Output: 10.0

        // Narrow casting example
        double myDouble2 = 3.14;
        int myInt2 = (int) myDouble2;  // Narrow casting
        System.out.println( myInt2);  // Output: 3
    }
}