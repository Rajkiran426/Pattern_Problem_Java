//Write a program to print--->
//    *****
//   *****
//  *****
// *****
//****

package pattern;

public class SoliRhombus {
		public static void main(String[] args) {
			for(int i=1; i<=5; i++) {
				//print spaces
				for(int j=1; j<=5-i; j++) {
					System.out.print(" ");
				}
				//print star
				for(int j=1; j<=5; j++) {
					System.out.print("*");
			/*		if(i==1||j==1||i==5||j==5) {
						System.out.print("*");
					}else {						
						System.out.print(" ");
					} */
				}
				System.out.println();
			}
		}
}
