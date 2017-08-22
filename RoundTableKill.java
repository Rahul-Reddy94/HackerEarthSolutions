import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RoundTableKill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total people");
		int totalPeople = scanner.nextInt();
		System.out.println("Enter Special member");
		int specialMember = scanner.nextInt();
		System.out.println("Enter Initial holding gun");
		int holdingGun = scanner.nextInt();
		int dieCount;

		int[] table = new int[totalPeople + 1];
		table[0] = 0;
		// int[] persons = new int[];
		for (int i = 1; i <= totalPeople; i++) {
			table[i] = 1;
		}
		while (table.length > 0) {
			dieCount = holdingGun % specialMember;
			if (dieCount > 0) {
				
				for(int eliminator = dieCount; eliminator > 0; eliminator--){
					table[holdingGun + eliminator] = 0;
				}
				
			}
			
		}
		// doattack(specialMember, holdingGun);
		/*
		 * private static int doattack(int specialMember, int holdingGun) { //
		 * TODO Auto-generated method stub int dieCount; return dieCount =
		 * holdingGun % specialMember;
		 * 
		 * }
		 */
	}
}