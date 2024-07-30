public class prime_no {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            int count=0;
            for(int j=2;j<=100;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                System.out.print(i+" ");
            }
        }

        
        //using only 1 for loop.
        for (int i = 2; i <= 100; i++) {
            if (((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0) || ((i / 2 == 1 && i % 2 == 0)
                    || (i / 3 == 1 && i % 3 == 0) || (i / 5 == 1 && i % 5 == 0) || (i / 7 == 1 && i % 7 == 0)))) {
                System.out.println("Second output: ");
                System.out.print(i + " ");
            }
        }
    }
}
