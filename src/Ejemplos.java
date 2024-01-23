

//Strings
import java.math.BigInteger;
    public class Ejemplos {
    /*
    public static void main(String[] args) {

        String ejemplo1 = "Hello, this is an example of a String.";
        System.out.println("Ejemplo 1: " + ejemplo1);

        String name = "Juan";
        String lastName = "Pérez";
        String ejemplo2 = "My name is " + name + " " + lastName + ".";
        System.out.println("Ejemplo 2: " + ejemplo2);

        String phrase = "This is an example of String manipulation.";
        String substring = phrase.substring(22,41);
        System.out.println("Ejemplo 3: " + substring);
    }
     */
    /*
    public static void main(String[] args) {
        // Example 1: Integer
        int example1 = 42;
        System.out.println("Example 1: " + example1);

        // Example 2: Double
        double example2 = 3.14;
        System.out.println("Example 2: " + example2);

        // Example 3: Long
        long example3 = 123456789L;
        System.out.println("Example 3: " + example3);

    */
    /*
    public static void main(String[] args) {

        BigInteger example1 = new BigInteger("123456789012345678901234567890");
        System.out.println("Example 1: " + example1);

        BigInteger example2 = new BigInteger("987654321098765432109876543210");
        System.out.println("Example 2: " + example2);

        long longValue = 987654321012345678L;
        BigInteger example3 = BigInteger.valueOf(longValue);
        System.out.println("Example 3: " + example3);
    }
    */
    /*
    public static void main(String[] args) {

        long example1 = 123456789012345678L;
        System.out.println("Example 1: " + example1);


        int intValue = 987654321;
        long example2 = (long) intValue;
        System.out.println("Example 2: " + example2);

        long example3 = 9223372036854775807L;
        System.out.println("Example 3: " + example3);
    }
     */
    /*
    public static void main(String[] args) {

        boolean example1 = true;
        System.out.println("Example 1: " + example1);


        boolean example2 = false;
        System.out.println("Example 2: " + example2);

        int number1 = 5;
        int number2 = 10;
        boolean example3 = number1 < number2;
        System.out.println("Example 3: " + example3);
    }
    */
    /*
    public static void main(String[] args) {

        byte example1 = 42;
        System.out.println("Example 1: " + example1);

        byte example2 = Byte.MAX_VALUE;
        System.out.println("Example 2: " + example2);

        byte example3 = Byte.MIN_VALUE;
        System.out.println("Example 3: " + example3);
    }

     */
    /*
    public static void main(String[] args) {

        short example1 = 12345;
        System.out.println("Example 1: " + example1);

        short example2 = Short.MAX_VALUE;
        System.out.println("Example 2: " + example2);

        short example3 = Short.MIN_VALUE;
        System.out.println("Example 3: " + example3);
    }

     */
    /*
    public static void main(String[] args) {

        float example1 = 3.14f;
        System.out.println("Example 1: " + example1);

        float example2 = 1.23e4f;
        System.out.println("Example 2: " + example2);

        float example3 = Float.MAX_VALUE;
        System.out.println("Example 3: " + example3);
    }

     */
    /*
    public static void main(String[] args) {

        char example1 = 'A';
        System.out.println("Example 1: " + example1);


        char example2 = '\u03A9';
        System.out.println("Example 2: " + example2);

        char example3 = '\n';
        System.out.println("Example 3: This is a text" + example3 + "with a newline.");
    }

     */
    /*
    public static void main(String[] args) {
        int num1 = 5;
        num1++;
        System.out.println("Increase in numerical variables: " + num1);

        char char1 = 'A';
        char1++;
        System.out.println("Increase in char variables: " + char1);

        int num2 = 8;
        num2--;
        System.out.println("Decrease in numerical variables: " + num2);

        char char2 = 'B';
        char2--;
        System.out.println("Decrement in char variables: " + char2);
    }

     */
        /*
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        boolean isEqual = (x == y);
        System.out.println("Equality Comparison: " + isEqual);
    }

         */
        /*
    public static void main(String[] args) {
        double a = 3.14;
        double b = 2.71;
        boolean isNotEqual = (a != b);
        System.out.println("Inequality Comparison: " + isNotEqual);
    }

         */
    public static void main(String[] args) {
        char char1 = 'A';
        char char2 = 'B';
        boolean isLessThan = (char1 < char2);
        boolean isGreaterThanEqual = (char1 >= 'A');
        System.out.println("Less Than Comparison: " + isLessThan);
        System.out.println("Greater Than or Equal Comparison: " + isGreaterThanEqual);

    }
}