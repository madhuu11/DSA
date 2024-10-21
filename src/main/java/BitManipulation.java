package main.java;

public class BitManipulation {
	
	//get bit at i position
	static int getBit(int num, int i) {
		int bitMask = 1<<i;
		if((num & bitMask) == 0) // operation : AND
			return 0;
		else
			return 1;
	}

	//set bit to 1 at i position
	static int setBit(int num, int i) {
		int bitMask = 1<<i;
		return num | bitMask; //operation : OR
	}

	//clear bit to 0 at i position
	static int clearBit(int num, int i) {
		int bitMask = 1<<i;
		return ~bitMask & num; //operation : AND with NOT
	}

	public static void main(String[] args) {
		int N = 70;
		System.out.println("The bit at the 3rd position from LSB is: " + getBit(N, 3) );
		System.out.println("The value of the given number "+N + " after setting the bit at " + "LSB is: " + setBit(N, 0));
		System.out.println("The value of the given number " +N+ " after clearing the bit at " + "LSB is: " + clearBit(N, 1));
	}
}
