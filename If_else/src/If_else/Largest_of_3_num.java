package If_else;
import java.util.Scanner;
public class Largest_of_3_num {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the number A:");
		int a=scan.nextInt();
		System.out.print("Enter the number B:");
		int b=scan.nextInt();
		System.out.print("Enter the number C:");
		int c=scan.nextInt();
		if (a>b && b>c){
			System.out.println("A is greater number ");
		}
		else if (b>c && c>a){
			System.out.println("B is greater number");
		}
		else if (c>a && a>b){
			System.out.println("C is greater number");
		}
	}
}
