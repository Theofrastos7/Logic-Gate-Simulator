package package1;

public class Or extends Gate{
	

	public Or(int c, int x, int y, int o) {
		
		this.column = c;
		this.input1PinOrder = x;
		this.input2PinOrder = y;
		this.outputPinOrder = o;
		
	}


	@Override
	public void operate() {

		int output = 0; 
		

		if (GateSimulator.brb.pin[this.column][this.input1PinOrder] == 0 && GateSimulator.brb.pin[this.column][this.input2PinOrder] == 0) {
		output = 0;
		//System.out.println("The exit is: " + output);
		}
		
		else {	
		output = 1;
		//System.out.println("The exit is: " + output);
		}
		
		GateSimulator.brb.pin[(column+1)][outputPinOrder] = output;
		
	}

	 
}
