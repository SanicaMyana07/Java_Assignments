public class pattern4 {
    public static void main(String[] args) {
        char mainch = 'A';
        int mainnum = 1;
        for (int i = 1; i <= 5; i++) {
            char ch = mainch;
            int num = mainnum;
            for (int j = 1; j <= 5; j++) {
                if (j % 2 == 0) {
                    System.out.print((num + 5) + " ");
                    num = num + (5 * j);
                    ch += 5;
                } else {
                        System.out.print(ch + " ");
                        ch += 5;
                    }
            }
            mainch++;
            mainnum++;
            System.out.println();
        }
    }
}
