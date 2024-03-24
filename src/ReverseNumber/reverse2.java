package ReverseNumber;
// shows error
public class reverse2 {
	public static void main(String[] args) {
		int num = 1234;
		int rev = 0; 
		for(int i=0;i<=3;i++) {
			rev = rev*10+ num%10;
			
			num=num/10;
		}
		System.out.println(rev);
	}

}
