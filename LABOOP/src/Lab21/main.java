package Lab21;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.print("Please enter your value :");
			int x;
			int y = 5;
			Scanner w = new Scanner(System.in);
			x = w.nextInt();
			
		System.out.println("---------------------------------");
		
		for (int i =1; i <= x; i++) {
			if(i == y){
				System.out.print(i);
				System.out.println();
				y = y + 5;
			}else {
				System.out.print(i + ",");
			}
		}	
	}
} //end main
