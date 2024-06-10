package com.customExceptionHandling;

public class StringOperations {

	public static void getCharacterFromString(String text, int value)throws StringIndexOutOfBoundsException
	{
		
		if(text != null)
		{
			System.out.println(text.charAt(value));
		}
		else
		{
			throw new StringIndexOutOfBoundsException("character not found in a given string...!");
		}
		
	
	}

}
