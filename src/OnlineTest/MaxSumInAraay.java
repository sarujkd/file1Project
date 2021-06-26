package OnlineTest;

public class MaxSumInAraay {

	public static void main(String[] args) {

		int[] iArray = { 1, 2, 6, 2, 5, -7 };

		int size = iArray.length;
		int iSum = 0, iMaxValue = 0;

		for (int i = 0; i < size ; i++) {
			iSum = 0;
			for (int j = i; j < size ; j++) {
				iSum += iArray[j];
				if (iMaxValue < iSum) {
					iMaxValue = iSum;

				}

			}
		}
System.out.println("Max value = "+iMaxValue);
	}

}
