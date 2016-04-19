package com.companyname.bank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	alwaysKillSomeone(args);
    }
    
    
    /**
     * prints the manner of death of the name used as input
     * @param args (String[]): the user's input
     */
    private static void alwaysKillSomeone(String[] args) {
    	try {
    		Util.printMessage(Util.killChar(args[0]));
    	}
    	catch(Exception E) {
    		Util.printMessage(Util.killChar("someone"));
    	}
    }
}