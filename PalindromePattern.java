//Write a progtam to print--->
//    1
//   212
//  32123
// 4321234
//543212345

package pattern;

public class PalindromePattern {
		public static void main(String[] args) {
			for(int i=1; i<=5; i++) {
				//print spaces
				for(int j=1; j<=5-i; j++) {
					System.out.print(" ");
				}
				//print number
				for(int j=i; j>=1; j--) {
					System.out.print(j);
				}
				//print right
				for(int j=2; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
}
