package com.biz.method;

public class Method12 {

	public static void main(String[] args) {
		triAngle(3);
		
		for(int i = 5; i <= 20 ; i++) {
			triAngle(i);
		}
		
	}
	
	public static void triAngle(int intStarCount) {
		
//		 int intStarCount = 5;
		
		for (int j = 0; j < intStarCount; j++) {
			// ºóÄ­À» ¸î°³ Âï°í
			for (int i = j; i < intStarCount; i++) {
				System.out.print(" ");
			}

			// ³²Àº ºÎºÐ¿¡ º°À» Âï¾î¶ó
			for (int k = 0; k < j; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	} // end triAngle
	
	
}