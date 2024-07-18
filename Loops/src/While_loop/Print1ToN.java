package While_loop;
import java.util.Scanner;
public class Print1ToN {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number upto where you want to print numbers: ");
		Long a=scan.nextLong();
		int i=1;
		while(i<=a) {
			System.out.println(i);
			i=i+1;
		}
	}
}
