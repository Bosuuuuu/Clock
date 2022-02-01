package Lab4;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Properties
		MyClassicalArray	m = new MyClassicalArray() ;
		MyCurrentArray      c = new MyCurrentArray();
		
		//Method	
		System.out.println(" ");
		System.out.println("MyClassicalArray");
		m.Rand();
		
		int Max = m.FMax();
		System.out.println("Max = " +Max);
		
		int Min = m.FMin();
		System.out.println("Min = " +Min);
		
		//Method	
		System.out.println(" ");
		System.out.println("MyCurrentArray");
		c.Rand();
		//Find max
		int CMax = c.FMax();
		System.out.println("Max = " +CMax);
		//Find min
		int CMin = c.FMin();
		System.out.println("Min = " +CMin);
		//Sort min -> max
		c.Sort();
		//Seaech
		System.out.println(" ");
		System.out.print("Position Num : ");
		Scanner scanf = new Scanner(System.in);
		int scan = scanf.nextInt();
		System.out.print("Position "+scan+" = " + c.Search(scan));	
	}//end main
}

