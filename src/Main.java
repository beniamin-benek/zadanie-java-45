import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> array = new LinkedList<Integer>();
		array = NumbersScanner.addToArray();

		
		System.out.println("Lista: " + array.toString());
			
		try {
			System.out.println("Suma: " + ArrayUtils.calculateSum(array));
			ArrayUtils.printTheSmallest(array);
			ArrayUtils.printTheBiggest(array);
		} catch (NullPointerException e) {
			System.err.println("Poda³eœ nieistniej¹c¹ lub pust¹ listê.");
		}
	
	}
	
}