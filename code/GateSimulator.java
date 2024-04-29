package package1;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GateSimulator {
	

	static BreadBoard brb;
	static Circuit cr;
	
	public static void main(String[] args) throws FileNotFoundException {
		
	brb = new BreadBoard();	
	
	cr = new Circuit(brb);	
	
	cr.LoadFile(brb);
	
	cr.CircuitLoad();
	
	brb.displayLine(0);

	brb.displayLine(1);
	
	brb.displayLine(2);
	
	brb.displayOutputs();
	
	cr.disaplayGateLayout();
	
	brb.displayFinalOutput();
	
}	
}
