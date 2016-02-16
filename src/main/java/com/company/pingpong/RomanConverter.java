package com.company.pingpong;

public class RomanConverter {

	public static int Convert(String s)
	{
		int sum = 0;

		String var = s.toUpperCase();

		if (var.equals(null) || var.length() == 0) {
			throw new RuntimeException("Error in Roman Numerals character");
		}
		
		if (var.matches("[V,L,C,D,I,M,X]{4,}")){
			throw new RuntimeException("Error in Repeating Roman Numerals character");
		}

		if (var.equals("IV")) {
			sum = 4;
		}
		
		else if (var.equals("IX")) {
			sum = 9;
		}
		
		else if (var.equals("XL")) {
			sum = 40;
		}
		
		else if (var.equals("XC")) {
			sum = 90;
		}
		
		else if (var.equals("CD")) {
			sum = 400;
		} 
		
		else if (var.equals("CM")) {
			sum = 900;
		} 
		
		else {
			for (int i = 0; i < var.length(); i++) {
				if (var.charAt(i) == 'I') {
					sum += 1;
				}

				else if (var.charAt(i) == 'V') {
					sum += 5;
				}

				else if (var.charAt(i) == 'X') {
					sum += 10;
				}

				else if (var.charAt(i) == 'L') {
					sum += 50;
				}

				else if (var.charAt(i) == 'C') {
					sum += 100;
				}

				else if (var.charAt(i) == 'D') {
					sum += 500;
				}

				else if (var.charAt(i) == 'M') {
					sum += 1000;
				}

				else {
					throw new RuntimeException("Error in roman numeral character");
				}
			}
		}

		return sum;
	}
}
