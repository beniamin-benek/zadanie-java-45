import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NumbersScanner {
	
	public static List<Integer> addToArray() {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> array = new LinkedList<Integer>();
		int arg = 0;
		
		do {
			System.out.println("Podaj liczbę: ");
			arg = scanner.nextInt();
			if (arg >= 0)
				array.add(arg);
			} while (arg >= 0);
		
		scanner.close();
		
		return array;
		
	}

}
