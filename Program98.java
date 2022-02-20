package trainingPackage3;

public class Program98 {

	public static void main(String[] args) {
		Program98 matObj = new Program98();
		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("The Substracted Matrix is ");
		matObj.subsMat(arr1,arr2);
	}
	public void subsMat(int arr1[][],int arr2[][]) {
		int i,j;
		for(i=0;i<arr1.length;i++) {
			for(j=0;j<arr2.length;j++) {
				System.out.print(arr1[i][j] - arr2[i][j]+" ");
			}System.out.println("");
		}
	}
}
