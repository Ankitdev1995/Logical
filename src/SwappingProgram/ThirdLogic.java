package SwappingProgram;

public class ThirdLogic {
public static void main(String[] args) {
	int a=30,b=15;
	
System.out.println("Before Swapping values are=> "+"a="+a+","+"b="+b);
	
	a=a*b; //30*15 = 450
	b=a/b; //450/15 = 30
	a=a/b; //450/30 = 15
	
System.out.println("After Swapping values are=> "+"a="+a+","+"b="+b);
}
}
