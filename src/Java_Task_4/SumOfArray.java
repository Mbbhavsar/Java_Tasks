package Java_Task_4;

public class SumOfArray {

	public static int main(String[] args) {

		int numbers[] = { 1, 2, 3, 4, 5 };

		if (numbers == null || numbers.length < 3)
			return 0;

		java.util.Arrays.sort(numbers);

		int sum = 0;
		for (int i = 1; i < numbers.length - 1; i++) {
			sum += numbers[i];
		}
		return sum;
	}

}
