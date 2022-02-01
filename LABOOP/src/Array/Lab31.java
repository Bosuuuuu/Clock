package Array;
import java.util.Scanner;
import java.util.Random;
    public class Lab31 {
    public static void main(String[] args) {
        System.out.print("Please enter your random value : ");
        int n;
            Scanner scanIn = new
            Scanner(System.in);
            n = scanIn.nextInt();
            scanIn.close();
                System.out.println(" ");
                System.out.println("-----------------------");
                int[] ar = new int[n];
                Random rand = new Random();
                for(int i = 0; i <= n ; i++ ) {
                    ar[i]= rand.nextInt(100);
                    System.out.println("Array[" + i + "] = "+ ar[i]);
                    }//end for
                }//end void 
    }//end class
