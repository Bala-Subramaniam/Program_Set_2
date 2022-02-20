package trainingPackage3;

public class Program83 {

	public static void main(String[] args) {
		int arrOne [] = { 34,2,33,57,443,11,2 };
		//int arrTwo[] = arrOne.clone();
		int arrTwo[] = new int[arrOne.length];
		arrTwo = arrOne;
		for (int i : arrTwo) {
			System.out.println(i);
		}
	}
}
