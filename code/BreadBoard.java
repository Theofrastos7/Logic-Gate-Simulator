package package1;

import java.util.Scanner;

public class BreadBoard {
	

	int[][] pin = new int[4][10];

	
	public void defineInputs(int []b) {
		for(int i=0; i<10 && i<b.length; i++) {
			
			pin[0][i] = b[i]; 
		}
	}
	
	
	public void displayOutputs() {
	for (int j=0; j<10; j++) {
		for (int i=0; i<4; i++){
			System.out.print(GateSimulator.brb.pin[i][j] + "	");
		}
		
		System.out.println("");
	}

  System.out.println("");
	
}
	
	
	public void displayFinalOutput() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Define the number and the location of the outputs: ");
		
		 int number = scan.nextInt();
		 int[] array = new int[10];
		 
		 for(int i=0; i<number; i++) {
			 array[i] = scan.nextInt(); 
		 }
		 
		 
		 for(int i=0; i<number; i++) {
			 
			 System.out.println("The " + i + "-st exit is: " + pin[3][array[i]]);
		 }
		
	}
	
	
	public void displayLine(int t) {
	
		for (int j=0; j<10; j++) {
			for (int i=0; i<4; i++){
				
				if (i>t) {
				System.out.print(0 + "	");	
			}
				else {
				System.out.print(GateSimulator.brb.pin[i][j] + "	");
				}
		}
			
	  System.out.println("");
		
	}
System.out.println("");
}
	
}

		


