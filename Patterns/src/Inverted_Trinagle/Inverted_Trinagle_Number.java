package Inverted_Trinagle;
import java.util.Scanner;
public class Inverted_Trinagle_Number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=n;
		while(i>0) {
			int j=1;
			while(j<=i) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
