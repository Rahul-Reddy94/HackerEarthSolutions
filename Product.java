import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Product {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		long N = Long.parseLong(line);
		long answer = 1;
		long[] elements = new long[(int) N];
		line = br.readLine();
		String[] tokens = line.split(" ");
		for(int i=0; i < tokens.length; i++){
			elements[i] =Long.parseLong(tokens[i]);
			answer = (long)((answer * elements[i]) % (Math.pow(10, 9) + 7));
		}
		System.out.println(answer);
		
	}

}
