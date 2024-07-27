public class pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int count = 0;
            for (int j = 1; j <= 4; j++) {
                count++;
                if (count <= 2) {
                    System.out.print(count);
                } else {
                    System.out.print("1");
                    count = 1;
                }
            }
            System.out.println();
        }
    }

}

// output:
// 1 2 1 2
// 1 2 1 2
// 1 2 1 2
// 1 2 1 2
