package ReverseString;

public class CharacterArray {
	public static void main(String[] args) {
		String str = "NAGPUR PUNE NAGPUR";
		String rev = "";
		
		char[]a=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--) {
		rev= rev +a[i];
		}
		System.out.println(rev);

	System.out.println("**************");
	
	String st = "Java is easy";
	String reverse = "";
	char[]aa = st.toCharArray();
		int ln = aa.length;
	for(int i=ln-1;i>=0;i--) {
		reverse = reverse + aa[i];
	}
	System.out.println(reverse);
	
	}

}
