package CharacterPattern;
import java.util.Scanner;
public class PatternABCD_BCDE {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			char t=(char)('A'+i-1);
			while(j<=n) {
				System.out.print((char)(t+j-1));
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
