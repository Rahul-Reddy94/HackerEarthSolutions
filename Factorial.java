import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		long N = Long.parseLong(line);
		long product = 1;
		for (long i = N; i > 0; i--) {
			product = product * i;
		}
		System.out.println(product);
	}
}
