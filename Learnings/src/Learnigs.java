import java.util.Arrays;
import java.util.Collections;

public class Learnigs{
	public static void main(String[] args) {
        int[] array = {10, 30, 25, 50, 40, 60, 20, 70}; 

        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Sorted Array (Descending Order): " + Arrays.toString(array));

        System.out.println("Top 3 Max value: ");
        for (int i = 0; i < Math.min(3, array.length); i++) {
            System.out.println(array[i]);
        }
    }
}