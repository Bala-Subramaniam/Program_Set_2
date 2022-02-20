package trainingPackage3;

public class Program93 {

	public static void main(String[] args) {
		Program93 arrayObj = new Program93();
		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arr2[][] = { { 6, 7, 8 }, { 9, 10, 11 }, { 12, 13, 14 } };
		int arr3[][] = new int[3][3];
		int j;
		System.out.println("The Product of both Matrix is ");
		for (int i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				arr3[i][j] = arr1[i][j] * arr2[i][j];
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}

	}

}
