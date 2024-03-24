package ReverseNumber;

import java.util.Scanner;

public class ScannerStringBuff {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number");
	int number = sc.nextInt();
	
	StringBuffer rev ;
	
	StringBuffer sb = new StringBuffer(String.valueOf(number));
	rev = sb.reverse();
	
			System.out.println(rev);
}
}
