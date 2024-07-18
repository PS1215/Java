import java.util.Scanner;
public class Diamond_Pattern {
	
	/* n=3 
	 *    *
	 *   * *
	 *  * * *
	 *   * *
	 *    *
	 */   
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number of star in middle line: ");
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print(" ");
				space++;
			}
			int j=1;
			int a=1;
			while(j<=i) {
				System.out.print("* ");
				j++;
				a++;
			}
			System.out.println();
			i++;
		}
		int b=n/2;
		while(b>=1) {
			int space=1;
			while(space<=(n/2+1-b)) {
				System.out.print(" ");
				space++;
			}
			int a=1;
			while(a<=(2*b-1)) {
				System.out.print("* ");
				a++;
			}
			System.out.println();
			b--;
			
			
		}
				
	}
}


	













