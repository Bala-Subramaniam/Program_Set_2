package trainingPackage3;

public class Program92 {

	public static void main(String[] args) {
		int matOne[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int matTwo[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int matSum[][] = new int[3][3];
		// int i, j;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matSum[i][j] = matOne[i][j] + matTwo[i][j];
				System.out.print(matSum[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
