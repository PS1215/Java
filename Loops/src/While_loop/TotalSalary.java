//totalSalary = basic + hra + da + allow – pf
//hra   = 20% of basic
//da    = 50% of basic
//allow = 1700 if grade = ‘A’
//allow = 1500 if grade = ‘B’
//allow = 1300 if grade = ‘C' or any other character
//pf    = 11% of basic.


package While_loop;
import java.util.Scanner;
public class TotalSalary {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int basic = scanner.nextInt();
	    char grade = scanner.next().charAt(0);
	    scanner.close();
	    double hra = 0.20 * basic;
	    double da = 0.50 * basic;
	    int allow = 0;
	    if (grade == 'A') {
	        allow = 1700;
	    } else if (grade == 'B') {
	        allow = 1500;
	    } else {
	        allow = 1300;
	    }
	    double pf = 0.11 * basic;
	    double totalSalary = (int) (basic + hra + da + allow - pf);
	    int ans= (int) Math.round(totalSalary);
	    System.out.println(ans);
	}
}






