package practicaljava;

import java.util.Scanner;


public class Reverseupper {
	
	
	
	{
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter a Text- ");
			String a = sc.nextLine();
			
			StringBuilder reverseString = new StringBuilder(a);
			reverseString.reverse();
			String result = reverseString.toString();
			
			System.out.println("Reversed string- "+result);
			
			System.out.println("The Uppercase is- "+a.toUpperCase());
			
		}

}