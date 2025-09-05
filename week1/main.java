import java.util.Arrays;

public class main{
	public static void main(String[] args){
		int[] arr = {1,9,2,7,30,3};
		int size = arr.length;

		for(int i = 0; i < size -1; i++){

			boolean swapped = false;

			for (int j = 0; j < size - i - 1; j++){

				if (arr[j] > arr[j + 1]){
					
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}