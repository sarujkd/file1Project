package OnlineTest;

public class missingNum {

	public static void main(String[] args) {
		int[] arr = { 6, 4, 3, 2, 1, 0 };
		int n = arr.length;
		System.out.println("Given array");
		for (int val : arr)
			System.out.print(val + " ");

		System.out.println("\nMissing number = " + missingNumber(arr, n));

	}

	public static int missingNumber(int arr[], int n) {

		int missingNum = n * (n + 1) / 2;

		for (int i = n - 1; i >= 0; i--) {

			missingNum -= arr[i];

		}
		return missingNum;

	}

}
