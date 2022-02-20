package trainingPackage3;

public class Program94{

	public static void main(String[] args) {
		Program94 arrayObj = new Program94();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		arrayObj.arrayVal(arr);
	}
	
	public void arrayVal(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println(arr[i]+" is Even number.");
			}
			else {
				System.out.println(arr[i]+" is Odd number.");
			}
			
		}
	}
}
