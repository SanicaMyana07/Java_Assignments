package Recursion;

public class FibonacciSeries {
    public int series(int a, int b, int num){
        if(num==0) {
            return 0;
        }
        int c=a+b;
        System.out.println(c);
        series(b,c,num-1);
        return c;
    }

    public static void main(String[] args) {
        FibonacciSeries obj1 = new FibonacciSeries();
        int num=7;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        obj1.series(a,b,num-2);
    }
}
