package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Circuit {
	
	static BreadBoard brb;
	Gate[][] gatearray = new Gate[3][10];
	String[][] gateLayout = new String[3][10];	
	
	
	
	public Circuit(BreadBoard brb) throws FileNotFoundException {

		
		brb = new BreadBoard();	
		Gate[] gatearray = new Gate[20];
		
		
	}
			
	
	public void CircuitLoad(){}



void LoadFile(BreadBoard brb)  throws FileNotFoundException {
	
			int inputarray[] = new int[10] ;
			int counter = 0;
		 
			File text = new File("F:\\\\test.txt");//creating File instance to reference text file in Java
		    
		    Scanner scnr = new Scanner(text);//Creating Scanner instance to read File in Java
		 
		    int lineNumber = 1;//Reading each line of the file using Scanner class

		    
		    while(scnr.hasNextLine()) {
		    	
		        String line = scnr.nextLine();
		        String[] stringarray = line.split(",");
		        
		        System.out.println("line " + lineNumber + " :" + line);
		        
		        
		        /*stringarray[1]*/ 
		        
		        if (lineNumber == 1) {
		        	
		        for (int i=0; i<10; i++) {
		        	
		        inputarray[i] = Integer.parseInt(stringarray[i]);
		        	
		        }
		        
		        brb.defineInputs(inputarray);
		        
		        }
		        		
		        else {
		        
		        switch (stringarray[0]) {
				
				case "and": 
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = new And(Integer.parseInt(stringarray[1]),Integer.parseInt(stringarray[2]),Integer.parseInt(stringarray[3]),Integer.parseInt(stringarray[4]));
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])].operate();
				gateLayout[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = stringarray[0]; 
				break;
				
				case "or":
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = new Or(Integer.parseInt(stringarray[1]),Integer.parseInt(stringarray[2]),Integer.parseInt(stringarray[3]),Integer.parseInt(stringarray[4]));
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])].operate();
				gateLayout[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = stringarray[0]; 
				break;
				
				case "nand": 
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = new Nand(Integer.parseInt(stringarray[1]),Integer.parseInt(stringarray[2]),Integer.parseInt(stringarray[3]),Integer.parseInt(stringarray[4]));
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])].operate();
				gateLayout[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = stringarray[0]; 
				break;
				
				case "nor":
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = new Nor(Integer.parseInt(stringarray[1]),Integer.parseInt(stringarray[2]),Integer.parseInt(stringarray[3]),Integer.parseInt(stringarray[4]));
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])].operate();
				gateLayout[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = stringarray[0]; 
				break;
				
				case "xor":
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = new Xor(Integer.parseInt(stringarray[1]),Integer.parseInt(stringarray[2]),Integer.parseInt(stringarray[3]),Integer.parseInt(stringarray[4]));
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])].operate();
				gateLayout[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = stringarray[0]; 
				break;
				
				case "xnor":
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = new Xnor(Integer.parseInt(stringarray[1]),Integer.parseInt(stringarray[2]),Integer.parseInt(stringarray[3]),Integer.parseInt(stringarray[4]));
				gatearray[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])].operate();
				gateLayout[Integer.parseInt(stringarray[1])][Integer.parseInt(stringarray[4])] = stringarray[0]; 
				break;
				
				default: 
				System.out.println("No such gate exists. Incorrect gate name input");
				
		        }	              
	}
		         
		        lineNumber++;
		    }   



System.out.println("");		    
		    
}


public void disaplayGateLayout() {
	
	for (int j=0; j<10; j++) {
		
		System.out.print((j+1) + "-st line Gates: ");
		
		for  (int i=0; i<3; i++) {
			if (gateLayout[i][j]!=null)
				System.out.print(gateLayout[i][j] + " ");
		}
		System.out.println(" ");
	}
	
	System.out.println(" ");
	
}

}



	

