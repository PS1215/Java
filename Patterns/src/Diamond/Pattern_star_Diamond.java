package Diamond;
import java.util.Scanner;
public class Pattern_star_Diamond {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;//upper half
		while(i<=n/2+1) {
			int space=1;
			while(space<=(n/2+1-i)) {
				System.out.print(" ");
				space++;
			}
			int star=1;
			while(star<=(2*i-1)) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			i++;
		}//lower half
		i=n/2;
		while(i>=1) {
			int space=1;
			while(space<=(n/2+1-i)) {
				System.out.print(" ");
				space++;
			}
			int star=1;
			while(star<=(2*i-1)) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			i--;
		}
	}
}
