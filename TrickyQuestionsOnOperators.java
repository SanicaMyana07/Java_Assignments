package Tasks;

public class TrickyQuestionsOnOperators {
    public static void main(String[] args) {

// Comparing floating-point numbers: Due to precision issues,
// comparing floating-point values (float or double) using == can lead to unexpected results.
        System.out.println(0.1 + 0.2 == 0.3);  // Output: false

//Modulus with negative numbers: The sign of the result of the modulus operator follows the sign of the dividend.
        System.out.println(-5 % 3);  // Output: -2

// Division by zero: In integer division (/), dividing by zero will throw an ArithmeticException. However,
// in floating-point division (/), dividing by zero results in positive/negative infinity.
       // System.out.println(5 / 0);  // ArithmeticException: / by zero
        System.out.println(5.0 / 0);  // Infinity


//This operator checks whether an object is an instance of a particular class or subclass.
//instanceof : Returns true if the object is an instance of the specified class or interface.
//Example:
        String s1= "Hello";
        String s = new String("Hello");
        System.out.println(s instanceof String);  // Output: true
       // For null references, instanceof always returns false.
        //String s2 = null;
        Integer s2=5;
        System.out.println(s2 instanceof Integer);  // Output: false

        //Typecast Operators
        byte b = (byte) 130;  // Output: -126 (due to overflow)

        //Switch case problem without break statement.




    }

}
