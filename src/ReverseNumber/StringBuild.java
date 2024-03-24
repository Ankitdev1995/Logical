package ReverseNumber;

import java.util.Scanner;

public class StringBuild {
public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a number");
	 int number = sc.nextInt();
	 
	 StringBuilder sbl = new StringBuilder();
	 sbl.append(number);
	 StringBuilder rev = sbl.reverse();
	 System.out.println(rev);
}
}
