public class reverseOfNumber {
    public static void main(String[] args) {
        // to find reverse of a number and to check if it is a palindrome or not.
        int a = 55885;
        int c = 0;
        int temp = a;
        for (a = 55885; a != 0; a = a / 10) {
            int b = a % 10;
            c = c * 10 + b;
        }
        System.out.println(c);
        if (temp == c) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

}
