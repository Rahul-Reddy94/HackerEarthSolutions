import java.util.*;

class Car_Names {
	public static void main(String args[]) throws Exception {

		// Scanner
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i=0;
		
		do{
			int[] countArr = new int[3] ;
			int count = 1;
			int uniqueC = 0;
			int index = 0;
			String name = scanner.next();
			char[] character = name.toCharArray();
			
			if((name.charAt(0) != name.charAt(name.length()-1)))
			{		
				for (int pointer = 1; pointer < name.length(); pointer++) {

					if (character[pointer-1] == character[pointer]) {
						count++;
					} else {
						countArr[index] = count;
						uniqueC++;
						count = 1;
						index++;
					}
					if (uniqueC == 3)
						break;
				}
				if(uniqueC == 2){
					countArr[index] = count;
				}
			}
			
			
			
			if(uniqueC ==2 && countArr[0]== countArr[1] && countArr[1] == countArr[2]){
				System.out.println("OK");
				name = "";
				i++;
			}
			else{
				System.out.println("Not OK");
				name = "";
				i++;
			}

		}while(i<N);
		scanner.close();
	}

}
