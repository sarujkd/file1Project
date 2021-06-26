package OnlineTest;

//Check how many times LeftArray is greater than rightArray

public class Q1Leftarr_greaterThan_rightarr {

	public static void main(String[] args) {
		int arr[] = { 10, 1, -5, 6 };

		int total = 0, leftTotal = 0, result = 0;

		for (int i : arr)
			total += i;
		System.out.println(total + "=Total ");

		for (int i = 0; i < arr.length - 1; i++) {

			leftTotal += arr[i];
			if (leftTotal > (total - leftTotal))
				result++;
		}

		System.out.println("Result= " + result);
	}

}
