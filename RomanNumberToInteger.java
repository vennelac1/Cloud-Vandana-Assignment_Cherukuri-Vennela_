package com.java.codes;
import java.util.HashMap;
public class RomanNumberToInteger 
{
	    public static int romanToInt(String s) {
	        HashMap<Character, Integer> romanToInteger = new HashMap<>();
	        romanToInteger.put('I', 1);
	        romanToInteger.put('V', 5);
	        romanToInteger.put('X', 10);
	        romanToInteger.put('L', 50);
	        romanToInteger.put('C', 100);
	        romanToInteger.put('D', 500);
	        romanToInteger.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            char currentChar = s.charAt(i);
	            int currentValue = romanToInteger.get(currentChar);
	            if (prevValue < currentValue) 
	            {
	                result -= prevValue;
	            } 
	            else 
	            {
	                result += currentValue;
	            }

	            prevValue = currentValue;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        String romanNumeral = "VI";
	        int integerEquivalent = romanToInt(romanNumeral);
	        System.out.println("Integer equivalent: " + integerEquivalent);
	    }
	}


