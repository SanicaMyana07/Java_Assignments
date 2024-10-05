package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class customE_HW {
    public void operation(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr1[]=new int[10];
        String arr2[] =new String[10];
        int j=0;
        int i=0;
        String str1 = null;
        int num=0;
        do {
            String str = null;
            try {
                {
                    str = br.readLine();
                    num = Integer.parseInt(str);
                    if (num > 0) {
                        arr1[i] = num;
                        i++;
                    } else {
                        throw new Exception();
                    }
                }
            } catch (Exception ex) {
                str1 = str;
                arr2[j] = str1;
                j++;
            }

        }while(i<=9);
        System.out.println("Integer");
        for(int k=0;k<=arr1.length-1;k++){
            System.out.println(arr1[k]);
        }
        System.out.println("String");
        if(arr2!=null){
            for(int l=0;l<= arr2.length-1;l++){
                if(arr2[l]!=null) {
                    System.out.println(arr2[l]);
                }
                }

        }
    }

    public static void main(String[] args) {
        customE_HW obj1= new customE_HW();
        obj1.operation();
    }
}
