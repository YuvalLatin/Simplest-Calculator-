package basic;

import java.util.Scanner;
import  basic.Calculator ;
public class Calculator {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in) ;
		double One = 0 , Two = 0 ;
		int ma = 0 ;
		System.out.println("Choose your first number");
		One = in.nextDouble() ;
		System.out.println("Choose your second number");
		Two = in.nextDouble() ;
		System.out.println("1 = * | 2 = / | 3 = + | 4 = - | choose mathematic action");
		ma = in.nextInt() ;
		if(ma == 1){
			System.out.println((double)One * (double)Two);
			
		}else if (ma == 2) {
			System.out.println((double)One / (double)Two);
			
		}else if (ma == 3) {
			System.out.println((double)One + (double)Two) ;
			
		}else if (ma == 4) {
			System.out.println((double) One - (double)Two);
			
		}
		in.close();
		
		
		
		
	}

}
