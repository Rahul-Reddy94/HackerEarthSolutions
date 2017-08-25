import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MagicalWord {
	public static ArrayList<Integer> primearray = new ArrayList<Integer>();
	// public static List<Integer,String> list = new List();

	public static HashMap<Integer, Character> mappingHashMap = new HashMap<Integer, Character>();

	public static void main(String args[]) throws IOException {

		Scanner scanner = new Scanner(System.in);
		// StringBuilder name = new StringBuilder();
		String name;
		int testCases = scanner.nextInt();
		mappingHashMap.put(67, 'C');
		mappingHashMap.put(71, 'G');
		mappingHashMap.put(73, 'I');
		mappingHashMap.put(79, 'O');
		mappingHashMap.put(83, 'S');
		mappingHashMap.put(89, 'Y');
		mappingHashMap.put(97, 'a');
		mappingHashMap.put(101, 'e');
		mappingHashMap.put(103, 'g');
		mappingHashMap.put(107, 'k');
		mappingHashMap.put(109, 'm');
		mappingHashMap.put(113, 'q');
		mappingHashMap.put(121, 'y');

		while (testCases > 0) {
			int stringSize = scanner.nextInt();
			char c = 0;

			name = scanner.next();

			for (int i = 65; i < 90 || ((i > 96) && (i < 123)); i++) {
				if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
					primearray.add(i);
					if (i == 89)
						i = 96;
				}
			}
			int i = 0;
			while (i < stringSize) {
				c = name.charAt(i);
				calcaulteNearByValue(c);
				i++;
			}
			System.out.println();
			testCases--;
		}
	}

	private static void calcaulteNearByValue(char c) {
		int currentCharAscii = (int) c;
		int minIndex = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();

		for (Integer integer : primearray) {
			array.add(Math.abs(integer - currentCharAscii));
		}

		minIndex = array.indexOf(Collections.min(array));
		System.out.print(mappingHashMap.get(primearray.get(minIndex)));
	}
}
