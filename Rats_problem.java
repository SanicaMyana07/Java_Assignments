package Accenture_cheatsheet_codingRound;

// Food Distribution Among Rats  Given the number of rats and their food requirement,
// write a function to determine if the food available in di"erent houses is su#cient.

public class Rats_problem {

    public static boolean food_available(int arr[],int total_no_rats,int unit){
        boolean available=false;
        int food_needed= total_no_rats * unit;
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        if(sum>=food_needed){
            available=true;
        }
        return available;

    }
    public static void main(String[] args) {
        int arr[]={4, 8, 2, 6, 5};
        boolean available2= Rats_problem.food_available(arr,7,2);
        System.out.println(available2);
    }
}
