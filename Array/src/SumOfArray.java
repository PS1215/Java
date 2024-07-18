import java.util.Scanner;
public class SumOfArray {
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
	
	public static int Sum(int arr[]) {
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int arr[]=takeInput();
		int add=Sum(arr); 
		System.out.print("Sum "+  add);
	}

}


