public class digitCount {
    public static void main(String[] args) {
        // to find the length of a number
        int a = 55885;
        int count = 0;
        for (a = 55885; a != 0; a = a / 10) {
            count++;
        }
        System.out.println(count);
    }
}
