package com.kennesaw.edu.os.cpu;
// Register class 
public class Register {
	
	// Global Variables
	private static int [] CPU_Register = new int[1024]; // Size is set to memory size
	private static int [] accumlator = new int[1024];
	
	// Set Register given index and value
	public static void setReg(int value, int position) {
		// No space
		if (position == 1) return;
		// If space is available, then assign value to array
		else if (position < CPU_Register.length) {
			CPU_Register[position] = value; 
		} 
		else {
			System.out.println("Something went wrong when tryint to set register");
		}
	}
	
	// Retrieve Register given an index
	public static int getReg(int position) {
		return CPU_Register[position];
	}
	
	// Called to update the accumlator from within the Register class
	public static void readBuffer(int buffer, int addr) {
		accumlator[addr] = buffer; 
	}
	
	// Called to write to the buffer
	public static int writeBuffer(int buffer, int addr) {
		buffer = accumlator[addr];
		return buffer;
	}
}
