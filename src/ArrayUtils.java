import java.util.List;

public class ArrayUtils {

	public static void printReversed(List<Integer> array) {
		for (int i = array.size() - 1; i >= 0; i--)
			System.out.print(array.get(i) + ", ");
	}
	
	public static int calculateSum(List<Integer> array) {
		if (array == null || array.size() == 0) throw new NullPointerException();
		
		int sum = 0;
		for(int i = 0; i < array.size(); i++) 
			sum = sum + array.get(i);
		
		return sum;
	}
	
	public static void printTheSmallest(List<Integer> array) {
		if (array == null || array.size() == 0) throw new NullPointerException();
		
		int min = array.get(0);
		for(int i = 0; i < array.size(); i++) {
			if (array.get(i) < min)
				min = array.get(i);
		}
		System.out.println("Najmniejszy element: " + min);
	}
	
	public static void printTheBiggest(List<Integer> array) {
		
		if (array == null || array.size() == 0) throw new NullPointerException();
		
		int max = array.get(0);
		for(int i = 0; i < array.size(); i++) {
			if (array.get(i) > max)
				max = array.get(i);
		}
		System.out.println("Największy element: " + max);
	}
}
