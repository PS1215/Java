package While_loop;
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number: ");
		Long a=scan.nextLong();
		int i=2;
		while(i<=a-1) {
			if(a%i==0) {
				System.out.println("Not Prime Number");
				return;
			}
			i=i+1;
		}
		System.out.println("Prime Number");
	}
}
