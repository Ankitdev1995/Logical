package SwappingProgram;

public class WithoutThirdVariable {
public static void main(String[] args) {
	
	int a=10,b=30;
	System.out.println("Before Swapping values are=> "+"a="+a+","+"b="+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After Swapping values are=> "+"a="+a+","+"b="+b);
}
}
