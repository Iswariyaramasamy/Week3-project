package com.scuba.java_week2;

public class AccessModifiers {
	
	private static int i=1;
	static int j=2;
	
	protected void diff() {
		
		int f= j-i;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int k = i+j;
		
		System.out.println(k);
			
	}

}