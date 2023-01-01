//Write a program to print--->
//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//5 5 5 5 5

package pattern;

public class NumberPyramid {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			//print spaces
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				//print number
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
