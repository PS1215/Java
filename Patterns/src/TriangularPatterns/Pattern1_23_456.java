package TriangularPatterns;
import java.util.Scanner;
public class Pattern1_23_456 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int t=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(t);
				j++;
				t++;
			}
			System.out.println();
			i++;
		}
	}
}
