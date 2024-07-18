package While_loop;
import java.util.Scanner;
public class FahrenheitToCelsiusTable {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int i = a;
        while (i <= b) {
            int celsius = (i - 32) * 5 / 9;
            System.out.println(i + " " + celsius);
            i +=c;
        }

	}

}
