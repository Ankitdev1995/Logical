package ReverseNumber;

import java.util.Scanner;

public class StringBuffered {
	public static void main(String[] args) {
		
		int num=102030;
		
		StringBuffer rev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		// valueOf() method convert our number into String format
		rev = sb.reverse();
		System.out.println(rev);	
	}
}