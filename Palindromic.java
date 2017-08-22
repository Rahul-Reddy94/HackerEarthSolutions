import java.util.Arrays;
import java.util.Scanner;

public class Palindromic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		char[] array1 = new char[name.length()];
		char[] array2 = new char[name.length()];

		array1 = name.toCharArray();
		
		for (int i = 0; i < array1.length; i++) {
			array2[(array1.length - 1) - i] = array1[i];
		}
		System.out.println(array1.length);
		System.out.println(array2.length);
		
		if(Arrays.equals(array1, array2)) System.out.println("YES");
		else System.out.println("NO");
	}

}
