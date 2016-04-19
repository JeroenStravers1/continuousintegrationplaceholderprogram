package com.companyname.bank;

public class Util 
{
	private static String METEOR = "A meteor comes crashing from the heavens, impacting on ";
	private static final String HEAD = "'s head!";
   
	
	/**
	 * prints a string message
	 * @param message (String): the message to print
	 */
	public static void printMessage(String message) {
	    System.out.println(message);
	}
   
	
	/**
	 * Generates a sentence describing the death of a character
	 * @param character (String): the name of the character to kill
	 * @return killCharacter (String): a full sentence describing the manner of death of the input character
	 */
	public static String killChar(String character) {
	    String killCharacter = METEOR + character + HEAD;
	    return killCharacter;
	}
   
}