package pattern;
//Write a program to print---->

//*      *
//**    **
//***  ***
//********
//********
//***  ***
//**    **
//*      *

public class ButterflyPattern {
	public static void main(String[] args) {
		// first half
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				//print star 
				System.out.print("*");
			}
			for(int j=1; j<=2*(4-i); j++) {
				//print spaces
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				//print spaces
				System.out.print("*");
			}
			System.out.println();
		}
		//second half
		for(int i=4; i>=1; i--) {
			//print star
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=2*(4-i); j++) {
				//print spaces
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				//print star
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
