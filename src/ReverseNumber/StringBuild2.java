package ReverseNumber;

public class StringBuild2 {
public static void main(String[] args) {
	int num = 54321;
	StringBuilder sb = new StringBuilder();
	sb.append(num);
	StringBuilder rev= sb.reverse();
	System.out.println(rev);
	
}
}
