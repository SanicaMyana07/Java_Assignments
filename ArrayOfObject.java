package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayOfObject {

    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    private static String name;
    private static int number;
    private static String address;
    static ArrayOfObject obj2=new ArrayOfObject();


    public String getname() throws IOException {
        System.out.println("Enter the name");
        name=br.readLine();
        return name;
    }
    public String get_address() throws IOException {
        System.out.println("Enter the address");
        address=br.readLine();
        return address;
    }
    public int get_number() throws IOException {
        System.out.println("Enter the number");
        number=Integer.parseInt(br.readLine());
        return number;
    }
    public Object collectedInfo() throws IOException {

        obj2.getname();
        this.name=name;
        obj2.get_number();
        this.number=number;
        obj2.get_address();
        this.address=address;
        obj2.obj3(obj2);
        return obj2;
    }



    public void obj3(Object obj2) {
        System.out.println("name: "+this.name);
        System.out.println("number: "+ this.number);
        System.out.println("address: "+ this.address);
        System.out.println();
    }


}
class dusra extends ArrayOfObject{
    static Object []arr=new Object[2];
     static dusra obj1=new dusra();
    public static void print(Object obj2) {
        for(int i=0;i< arr.length;i++){
            obj1.obj3(obj1);
        }
    }


    public static void putINArray(Object obj2) throws IOException {
        for(int i=0;i<arr.length;i++){
            arr[i]=obj1.collectedInfo();

        }
        print(obj1);
    }
    public static void main(String[] args) throws IOException {
        ArrayOfObject obj3= new dusra();
        obj3.collectedInfo();
        putINArray(obj3);
    }

}