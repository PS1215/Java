import java.util.Scanner;
public class Print_till_n {
	public static int PrintTillN (int n){
		for (int i=0;i<=n;i++) {
			System.out.println(i);
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p = s.nextInt();
		int ans = PrintTillN(p);
		System.out.println(ans);
	}
}

