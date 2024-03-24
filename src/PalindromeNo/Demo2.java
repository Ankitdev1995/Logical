package PalindromeNo;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int org_num = num;
		int rev = 0; 
		int len = 0;
		for(int i=0;i<=len;i++) {
			rev = rev*10+ num%10;	
			num=num/10;
		}
	
	if(org_num == rev) {
		System.out.println(org_num+"=>palindrome number");
	}
	else {
		System.out.println(org_num+"=>not a palindrome number");
	}
}
}