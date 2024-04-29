package package1;

public class And extends Gate{
	
	public And(int c, int x, int y, int o) {
		
		this.column = c;
		this.input1PinOrder = x;
		this.input2PinOrder = y;
		this.outputPinOrder = o;
		
	}
	



	@Override
	public void operate() {			
		
		int output = 0;
		
		
		if (GateSimulator.brb.pin[this.column][this.input1PinOrder] == 1 && GateSimulator.brb.pin[this.column][this.input2PinOrder] == 1) { 
		output = 1;	
		}
		
		else {
		outputPinOrder = 0;	
		}
		
		GateSimulator.brb.pin[(column+1)][outputPinOrder] = output;
		
	}
}
