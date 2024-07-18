import java.util.Scanner;
public class isPrime {
	public static boolean is_prime (int a) {
		for(int  i=2;i<=a-2;i++) {
			if (a%i==0) {
				return false;
			}
		}
		return true;
	}		
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int p = s.nextInt();
			boolean ans = is_prime(p);
			System.out.println(ans);
		}
	}
