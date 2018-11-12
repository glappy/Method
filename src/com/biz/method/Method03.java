package com.biz.method;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO ºóÄ­°ú ¹®ÀÚ¿­ ÀÌ¾î¼­ Âï±â
		System.out.println("´ëÇÑ¹Î±¹");
		System.out.println("¿ì¸®³ª¶ó");
		
		System.out.print("´ëÇÑ");
		System.out.print("¹Î±¹");
		System.out.println("¿ì¸®³ª¶ó");
		
		System.out.print(". . . . . ");
		System.out.println("¿ì¸®");
		
		System.out.print(". . . . ");
		System.out.println("¿ì¸®");
		
		System.out.print(". . . ");
		System.out.println("¿ì¸®");

		System.out.print(". . ");
		System.out.println("¿ì¸®");
		
		System.out.print(". ");
		System.out.println("¿ì¸®");

		System.out.print("");
		System.out.println("¿ì¸®");

		System.out.println("===============");
		
		System.out.print("          ");
		System.out.println("* ");
		System.out.print("        ");
		System.out.println("* * ");
		System.out.print("      ");
		System.out.println("* * * ");
		System.out.print("    ");
		System.out.println("* * * * ");
		System.out.print("  ");
		System.out.println("* * * * * ");
		
		System.out.println("===============");
		
		// TODO ºóÄ­Âï°í º°Âï±â
		System.out.println("--- ºóÄ­ Âï°í º°Âï±â");
		for(int j = 0 ; j < 5 ; j++) {
			// ºóÄ­À» ¸î°³ Âï°í
			for(int i = j ; i < 5 ; i++) {
				System.out.print(". ");
			}
			
			//³²Àº ºÎºÐ¿¡ º°À» Âï¾î¶ó
			for(int k = 0 ; k < j ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("===============");
		// TODO ºóÄ­ Âï°í ¿ª»ï º°Âï±â
		System.out.println("--- ºóÄ­ Âï°í ¿ª»ï º°Âï±â");
		for(int j = 0 ; j < 5 ; j++) {

			// ºóÄ­À» ¸î°³ Âï°í
			for(int i = 0 ; i < j ; i++) {
				System.out.print("  ");
			}

			//³²Àº ºÎºÐ¿¡ º°À» Âï¾î¶ó
			for(int k = j ; k < 5 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// TODO ºóÄ­ Âï°í ¿ª Á¤»ï°¢ º°Âï±â
		System.out.println("--- ºóÄ­ Âï°í ¿ª Á¤»ï°¢ º°Âï±â");
		System.out.println("===============");
		for(int j = 0 ; j < 5 ; j++) {

			// ºóÄ­À» ¸î°³ Âï°í
			for(int i = 0 ; i < j ; i++) {
				System.out.print(" ");
			}

			//³²Àº ºÎºÐ¿¡ º°À» Âï¾î¶ó
			for(int k = j ; k < 5 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// TODO ºóÄ­Âï°í º°Âï±â
		System.out.println("--- ºóÄ­ Âï°í Á¤»ï°¢ º°Âï±â");
		for(int j = 0 ; j < 5 ; j++) {
			// ºóÄ­À» ¸î°³ Âï°í
			for(int i = j ; i < 5 ; i++) {
				System.out.print(" ");
			}
			
			//³²Àº ºÎºÐ¿¡ º°À» Âï¾î¶ó
			for(int k = 0 ; k < j ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
