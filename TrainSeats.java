import java.util.Scanner;
import java.util.HashMap;


public class TrainSeats { 
	public static int indexType;
	public static HashMap<Integer, String> data = new HashMap<>();

	public static void main(String[] args) throws Exception {

		int[][] seats = new int[6][2];
		Scanner scanner = new Scanner(System.in);
		double testCaseCount = scanner.nextFloat();
		
		for (int i = 0; i < testCaseCount; i++) {

			float seatNumber = scanner.nextFloat();
			//Data Caching Useful while large output
			if(data.get((int) seatNumber) != null){
				System.out.println(data.get((int) seatNumber));
				continue;
			}	
			
			int cabinNumber = (int) Math.ceil(seatNumber / 12);

			int[][] cabinetSeats = calculateSeats(cabinNumber, seats);
			int oppositeSeat = calculateOppositeSeat(cabinetSeats, seatNumber);
			calculateType(cabinetSeats, oppositeSeat, (int) seatNumber);
		}
	}

	private static void calculateType(int[][] cabinetSeats, int oppositeSeat, int seatNumber) {
		
		String output;
		if (indexType == 1 || indexType == 6)
			output = oppositeSeat + " " + "WS" + "\n";

		else if (indexType == 2 || indexType == 5)
			output = oppositeSeat + " " + "MS" + "\n";

		else 
			output = oppositeSeat + " " + "AS" + "\n";
			
		System.out.print(output);
		data.put(seatNumber, output);
	}


	public static int calculateOppositeSeat(int[][] cabinetSeats, float seatNumber) {
		
		for(int j = 5; j >= 0; j--)
			for(int i = 0; i < 2; i++){
				if(cabinetSeats[j][i] == seatNumber && i == 0){
					indexType = j + 1;
					return cabinetSeats[j][1];
				}
					
				else if(cabinetSeats[j][i] == seatNumber && i == 1){
					indexType = j + 1;
					return cabinetSeats[j][0];
				}
					
			}
		
		return 0;
	}

	private static int[][] calculateSeats(int cabinNumber, int[][] seats) {

	cabinNumber = cabinNumber - 1;
	int seatNumber = (cabinNumber * 12) + 1;
	for (int j = 0; j <= 1; j++) {
		for (int i = 5; i >= 0; i--) {
			if(j != 1)
				seats[i][j] = seatNumber;

			else
				seats[Math.abs(i - 5)][j] = seatNumber;
			
			seatNumber++;
		}

	}
	
	return seats;
}
}
	/*
	 * More Time Taking Solution
	 * public static int indexType;
	public static void main(String[] args) throws Exception {
		
		int[][] seats = new int[6][2];
		Scanner scanner = new Scanner(System.in);
		double N2 = scanner.nextFloat();
		for(int i =0;i<N2;i++){
			float N = scanner.nextFloat();
		
		int roundOffNumber;
		if (N < 12) {
			roundOffNumber = 1;
		} else {
			roundOffNumber = (int) Math.ceil(N / 12);
		}
		int[][] cabinetSeats = calculateSeats(roundOffNumber, seats);
		int oppositeSeat = calculateOppositeSeat(cabinetSeats, N);
		System.out.print(oppositeSeat + " ");
		calculateType(cabinetSeats, oppositeSeat);
		}

	}

	private static void calculateType(int[][] cabinetSeats, int oppositeSeat) {
		if(indexType == 1 || indexType == 6){
			System.out.print("WS" + "\n");
			
		}else if(indexType == 2 || indexType == 5)
			System.out.print("MS"+ "\n");
		else{
			System.out.print("AS"+ "\n");

		}
	}

	public static int calculateOppositeSeat(int[][] cabinetSeats, float N){
		int index = 0;
		for (int j2 = 0; j2 <= 1; j2++)
			for (int i2 = 0; i2 <= 5; i2++) {
				if (cabinetSeats[i2][j2] == (int) N)
					if (j2 == 0) {
						index = cabinetSeats[i2][j2 + 1];
						indexType = i2+1;
						break;
					} else {
						index = cabinetSeats[i2][j2 - 1];
						indexType = i2+1;
						break;
					}
			}
		return index;
	}

	private static int[][] calculateSeats(int roundOffNumber, int[][] seats) {

		for (int j = 0; j <= 1; j++) {
			for (int i = 5; i >= 0; i--) {
				switch (i) {
				case 5:
					if (j == 0)
						seats[i][j] = 1 + (12 * (roundOffNumber - 1));
					else
						seats[i][j] = 12 + (12 * (roundOffNumber - 1));
					break;
				case 4:
					if (j == 0)
						seats[i][j] = 2 + (12 * (roundOffNumber - 1));
					else
						seats[i][j] = 11 + (12 * (roundOffNumber - 1));
					break;
				case 3:
					if (j == 0)
						seats[i][j] = 3 + (12 * (roundOffNumber - 1));
					else
						seats[i][j] = 10 + (12 * (roundOffNumber - 1));
					break;
				case 2:
					if (j == 0)
						seats[i][j] = 4 + (12 * (roundOffNumber - 1));
					else
						seats[i][j] = 9 + (12 * (roundOffNumber - 1));
					break;
				case 1:
					if (j == 0)
						seats[i][j] = 5 + (12 * (roundOffNumber - 1));
					else
						seats[i][j] = 8 + (12 * (roundOffNumber - 1));
					break;
				case 0:
					if (j == 0)
						seats[i][j] = 6 + (12 * (roundOffNumber - 1));
					else
						seats[i][j] = 7 + (12 * (roundOffNumber - 1));
					break;
				default:
				}
			}

		}
		return seats;
	}*/

	/*  Different Approach !! But Its cool !! Have a look
	credits : Nguyễn Đình Chung

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
 
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
    
        for(int i = 0; i < N; i++){
            int seat = s.nextInt();
            int facing = (seat/12 + 1 - ((seat%12==0) ? 1 : 0))*12 + 1 - ((seat%12==0) ? 12 : seat%12);
            System.out.print(facing + " ");
            
            if(seat%6 == 2 || seat%6 == 5)
                System.out.println("MS");
            else
                if(seat%6 == 1 || seat%6 == 0)
                    System.out.println("WS");
                else
                    System.out.println("AS");
        }
    }
}
Language: Java 8*/

