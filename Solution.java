package HackerRank;

import java.util.*;
import java.io.*;

//We use the integers , , and  to create the following series:
//
//You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.
//Input Format
//The first line contains an integer, , denoting the number of queries.
//Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.
//Constraints
//
//
//
//Output Format
//For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

public class Solution{
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of queries:");
            int t=in.nextInt();
            int a = 0;
            int b = 0;
            int n = 1;
            for(int i=0;i<t;i++){
                System.out.println("Enter the values of a,b and n for "+ (i+1) +" query");
                a = in.nextInt();
                b = in.nextInt();
                n = in.nextInt();
                int ans=0;
                for(int j=0;j<n;j++){
                    if(t>=0 && t<=500 && a>=0 && b<=50 && n>=1 && n<=15 ){
                        if(j==0){
                            ans=(a+(((int)Math.pow(2,j))*b));
                        }
                        else{
                            ans=ans+(((int)Math.pow(2,j)*b));
                        }
                    }
                    System.out.print(ans+" ");
                }
                System.out.println();
            }




            in.close();
        }
    }

