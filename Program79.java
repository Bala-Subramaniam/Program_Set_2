package trainingPackage3;

public class Program79 {

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5,6,7,8,9 };
		int i = 0;
		do {
			if(arr[i] % 2 == 1) {
			System.out.println(arr[i]);		
			}i++;
		} while (i<arr.length);
		
	}

}
int greaterVal =0; 
for (int i : arr) {
	if (arr[i]>greaterVal) 
		greaterVal = arr[i];
}System.out.println(greaterVal)