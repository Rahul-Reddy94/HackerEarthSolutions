import java.util.Scanner;


public class LifeUniverse {
	//Taking more size for large input, somewhat efficient
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		StringBuilder builder = new StringBuilder();;
		
		while (N != 42) {
			builder.append(N+"\n");
			N = scanner.nextInt();
		}			
		System.out.println(builder);
		scanner.close();
	}
}
	
	/* Taking more size for large input
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); 
		while(N!=42)
		{
		System.out.println(N);
		N = scanner.nextInt();
		}
		scanner.close();
	 */
