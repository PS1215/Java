package Isosceles_Triangle;
import java.util.Scanner;
public class Pattern_Star {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print(" ");
				space++;
			}
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			int p=i-1;
			j=1;
			while(j<=i-1) {
				System.out.print("*");
				j++;
				p--;
			}
			System.out.println();
			i++;
		}
	}
}
