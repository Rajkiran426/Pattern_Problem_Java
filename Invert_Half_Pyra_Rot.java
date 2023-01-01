//Write a program to inverted half pyramid rotated by 180 degree.
//   *
//  **
// ***
//****
package pattern;

public class Invert_Half_Pyra_Rot {
		public static void main(String[] args) {
			for(int i=1; i<=4; i++) {
				//space print
				for(int j=1; j<=4-i; j++) {
					System.out.print(" ");
				}
				//star print
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
