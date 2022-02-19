package trainingPackage3;

public class Program80 {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 3, 0, 986, 5, 4 };  //throws exception when val is > than array length.
		int j = arr[0];
		for (int i : arr) {
			int x = j ; // holding x by storing j value (following number ) i.e arr[n+1].
			j = (i > x) ? i : x; //comparing to next number & storing greater value.
		}
		System.out.println("Greatest value in this array is "+j);
		
		int greaterVal = 0,i=arr[0];
		while(i<arr.length) {
			if (arr[i] > greaterVal)
				greaterVal = arr[i];
			i++;
		}
		System.out.println("Greatest value in this array is "+greaterVal);
	}
}
