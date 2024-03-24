package OptionalEx;

import java.util.Optional;

public class OptionalExample {
//	 Why optional objects ?
//	 ==> java optional class provides a way to deal with null values. It is used to represent a value is present or not. 
//	java 8 added a new class optional available in java.util package.
//	A NullPointerException is a common issue in java application. To prevent this, we normally add frequent NULL checks 
//	in our code to check if a variable is not empty before we use it in our program. 
//	Optional provides a better approach to handle such situations.
//	You can view optional as a single-value container that either contains a value or doesn't (it is then said to be "empty"),
//	A container object which may or may not contain a non-null value. If a value is present, 
//	isPresent() will return true and get() will return the value.
//	Additional methods that depend on the presence or absence of a contained value are provided, 
//	such as orElse() (return a default value if value not present) and ifPresent() (execute a block of code if the value is present).   
	
	public static void main(String[] args) {
		String s  = null;
		if(s==null) {
			System.out.println("this is null object");	
		}else {
			System.out.println(s.length());
		}
	
// this thing we can do by using optional class
//	String str = "java is easy";
//	Optional<String> optional = Optional.ofNullable(str);
//	System.out.println(optional.isPresent());
// System.out.println(optional.get());

//	System.out.println(optional.orElse("No value in this object"));
// orElse==>  If a value is present, returns the value, otherwise returns other	
		
		System.out.println("***********");
		
		String strs = "java";
		Optional<String> op = Optional.ofNullable(strs);
		System.out.println(op.isPresent());
		System.out.println(op.get());
		System.out.println(op.orElse("nothing is there"));
	
}
}
