public class TypeCastingExample {
    public static void main(String[] args) {
        // Declare a double variable with a decimal value
        double myDouble = 9.75;

        // Cast double to int (explicit casting)
        int castedInt = (int) myDouble;

        // Display the result of casting double to int
        System.out.println("Original double value: " + myDouble);
        System.out.println("Double casted to int: " + castedInt);

        // Declare an int variable
        int myInt = 42;

        // Cast int to double (implicit casting)
        double castedDouble = myInt;

        // Display the result of casting int to double
        System.out.println("Original int value: " + myInt);
        System.out.println("Int casted to double: " + castedDouble);
    }
}
