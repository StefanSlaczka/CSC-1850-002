import java.util.Scanner;

// make a bubble sort

public class main{
	public static void main(String[] args){		// insulise it
		// int[] arr;

		// int arr[] = new int[size];

		// int[] arry = {40,55,63,77};
		
		// Find the size of an array
		//arr.length;

		int size = 10;
		int[] list = new int[size];
		int number = 0;

		recieveInput(list, size);
		double avg = findAvg(list, size);
		System.err.println(avg);
	}

	public static void recieveInput(int [] list, int size) {
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<size; i++) {
			System.err.println("input number");
			list[i] = scanner.nextInt();
		}
	}
	public static double findAvg(int [] list, int size) {
		double avg = 0;
		// finsh code
		for (int j=0; j < size; j ++ ) {
			avg += list[j];
		}
		avg /= size;
		return avg;
	}
}