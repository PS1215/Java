import java.util.Scanner;
public class Largest_element {
	public static int[] takeInput() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int LargestElement(int arr[]) {
		int max=Integer.MIN_VALUE;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arr[]=takeInput();
		print(arr);
		int largest=LargestElement(arr); 
		System.out.print("Largest Element "+  largest);
	}

}
