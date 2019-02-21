import java.util.List;

class Main {

	public static void main(String[] args) {

		List<Integer> array = NumbersScanner.addToArray();

		System.out.println("Lista: " + array.toString());
		System.out.print("Od tyłu: "); ArrayUtils.printReversed(array);

		try {
			ArrayUtils.printSum(array);
			ArrayUtils.printTheSmallest(array);
			ArrayUtils.printTheBiggest(array);
		} catch (NullPointerException e) {
			System.err.println("Podałeś nieistniejącą lub pustą listę.");
		}
	
	}
	
}
