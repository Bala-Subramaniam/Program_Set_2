package trainingPackage3;

public class Program81 {

	public static void main(String[] args) {
		int arr[] = {234,3256,52,4098 };
		int smallNum=arr[0];
		for (int i = 0 ; i<arr.length;i++) {
			if (arr[i]<smallNum) {
				smallNum = arr[i];
			}
		}System.out.println("Smallest value in this array is "+smallNum);
	}
}
