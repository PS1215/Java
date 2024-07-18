package While_loop;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int i=1;
		while(i<=10) {
			int r =i*a;
			System.out.println(r);
			i=i+1;
		
		}

	}

}
