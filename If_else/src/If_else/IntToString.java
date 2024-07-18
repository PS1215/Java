// upto 3 only

package If_else;
import java.util.Scanner;
public class IntToString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number between 1 to 3 :");
		int a=scan.nextInt();
		if (a==1) {
			System.out.println("one");
		}
		else if (a==2) {
			System.out.println("Two");
		}
		else if (a==3) {
			System.out.println("Three");
		}
	}
}
