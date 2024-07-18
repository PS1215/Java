package While_loop;
import java.util.Scanner;
public class SumOfEven_N_Numbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Long a=scan.nextLong();
		int i=0;
		int sum=0;
		while(i<=a) {
			sum=sum+i;
			i=i+2;
		}
System.out.println(sum);
	}
}
