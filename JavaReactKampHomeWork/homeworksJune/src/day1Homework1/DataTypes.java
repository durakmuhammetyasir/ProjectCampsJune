package day1Homework1;

public class DataTypes {

	public static void main(String[] args) {
		/*
		There are four reference types in Java:
		• class types
		• interface types
		• enums
		• array types		
		*/
		
		/*
			Java Primitive and Equivalent Reference Types
			Primitive 	Class
			byte 		java.lang.Byte
			short 		java.lang.Short
			int 		java.lang.Integer
			long 		java.lang.Long
			float 		java.lang.Float
			double 		java.lang.Double
			boolean 	java.lang.Boolean
			char 		java.lang.Char
		*/
		
		/*
		 	List of Primitive Data Types, Their Size, Range, and Examples
			Data Type Size in Bits Signed/Unsigned 		Range						Example
			byte 			8 		Signed 			-27 to +27 	- 1 				-2, 8, 10
			short 			16 		Signed 			-215 to +215 - 1 				-2, 8, 10
			int 			32 		Signed 			-231 to +231 - 1 				1990, -90, 23
			long 			64 		Signed 			-263 to +263 - 1 				1990L, -90L, 23L
			char			16 		Unsigned 		0 to 65535 						'A', '8', '\u0000'
			float 			32 		Signed 			-3.4 x 1038 to +3.4 x 1038 		12.89F, -89.78F
			double 			64 		Signed 			-1.7 x 10308 to +1.7 x 10308 	12.78, -78.89
			boolean 	Unspecified	N/A 			true and false 					true, false		
		
		*/
		
		/*
			List of Character Escape Sequences
			Character Escape Sequence Description
			'\n' A linefeed
			'\r' A carriage return
			'\f' A form feed
			'\b' A backspace
			'\t' A tab
			'\\' A backslash
			'\"' A double quote
			'\'' A single quote		
		*/
		
		/*
			Constants Defined in the Float Class
			float Constants 		Meaning
			Float.POSITIVE_INFINITY Positive infinity of type float.
			Float.NEGATIVE_INFINITY Negative infinity of type float.
			Float.NaN 				Not a Number of type float.
			Float.MAX_VALUE 		The largest positive value that can be represented in a float variable.This is equal to 3.4 x 1038 (approx.).
			Float.MIN_VALUE 		The smallest positive value greater than zero that can be represented in a float variable. This is equal to 1.4 x 10-45.		
			
			Constants in the Double Class
			double Constants 			Meaning
			Double.POSITIVE_INFINITY 	Positive infinity of type double.
			Double.NEGATIVE_INFINITY 	Negative infinity of type double.
			Double.NaN 					Not a Number of type double.
			Double.MAX_VALUE 			The largest positive value that can be represented in a double variable.This is equal to 1.7 x 10308 (approx.).
			Double.MIN_VALUE 			The smallest positive value greater than zero that can be represented in a double variable. This is equal to 4.9 x 10-324.
		*/
		
		int anInt = 100;
		long aLong = 200L;
		byte aByte = 65;
		short aShort = -902;
		char aChar = 'A';
		float aFloat = 10.98F;
		double aDouble = 899.89;
		// Print values of the variables
		System.out.println("anInt = " + anInt);
		System.out.println("aLong = " + aLong);
		System.out.println("aByte = " + aByte);
		System.out.println("aShort = " + aShort);
		System.out.println("aChar = " + aChar);
		System.out.println("aFloat = " + aFloat);
		System.out.println("aDouble = " + aDouble);
		// Print some double constants
		System.out.println("Max double = " + Double.MAX_VALUE);
		System.out.println("Min double = " + Double.MIN_VALUE);
		System.out.println("Double.POSITIVE_INFINITY = " + Double.POSITIVE_INFINITY);
		System.out.println("Double.NEGATIVE_INFINITY = " + Double.NEGATIVE_INFINITY);
		System.out.println("Not-a-Number for double = " + Double.NaN);
		System.out.println("Double takes " + Double.BYTES + " bytes");
		
		/*
			IEEE floating-point exceptions
		•	 Division by zero exception
		•	 Invalid operation exception				
					•	 Square root of a negative number
					•	 Division of zero by zero or of infinity by infinity
					•	 Multiplication of zero and infinity
					•	 Any operation on a signaling NaN
					•	 Subtracting infinity from infinity
					•	 When a quiet NaN is compared with the > or < relational operators
		•	 Overflow exception
		•	 Underflow exception
		•	 Inexact exception
		*/
		
	}

}
