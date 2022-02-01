package Lab22 ;
import java.util.Scanner ;
public class mainPrime {
	static void Num(int x) {
		System.out.print(" : Divide by ") ;
		for(int i = 2 ; i < x ; i++) {
			if(x%i == 0) {
				System.out.print(i + ", ") ;
			}
		}//end for
				System.out.println("\b\b") ;
	}//end Num
	static void checkPrime(int x) {
		boolean prime ;
			for(int i = 2 ; i <= x ; i++) {
				prime = true ;
				System.out.print(i + " = ") ;
				for(int j = 2 ; j < i ; j++) {
					if(i%j == 0) {
						prime = false ;
						System.out.print("Not Prime") ;
						Num(i) ;
						break ;
					}
				}//end for2
			if(prime) {
				System.out.println("Prime Number") ;
				}
			}//end for1
	}//end checkPrime
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in) ;
		System.out.print("Please enter your value : ") ;
		int x = userInput.nextInt() ; 
		System.out.println("-----------------------") ;
		checkPrime(x) ;
	}//end main
}//end mainPrime