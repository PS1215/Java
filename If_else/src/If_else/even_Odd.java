package If_else;
import java.util.Scanner;
public class even_Odd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number: ");
		long a=scan.nextLong();
		if(a%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}

	}

}
