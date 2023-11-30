package BusResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	public Bus(int busNo,boolean ac,int capacity){
		this.busNo=busNo;
		this.ac=ac;
		this.capacity=capacity;
	}
	
	public int getBusNo() {
		return busNo;
	}

	public boolean getAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void displayBusInfo() {
		System.out.println("Bus No: "+busNo+ "\nAC: "+ac+"\nCapacity: "+capacity);
	}
}
