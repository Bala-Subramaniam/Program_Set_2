package trainingPackage3;

public class Program95 {

	public static void main(String[] args) {
		Program95 transObj = new Program95();
		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("The Transposed Matrix is ");
		transObj.transposeMat(arr1);
	}
	public void transposeMat(int arr[][]) {
		int i ,j;
		for (i=0;i<arr.length;i++) {
			for (j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println("");
		}
	}
}
