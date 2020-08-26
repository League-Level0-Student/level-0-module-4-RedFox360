package _03_char._2_string_methods;


public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
String s = "a0952jfl";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
System.out.println(s.charAt(2));
		
		// 3. Print the length of your String to the console.
		//    HINT: .length()
int length = s.length();
System.out.println(length);
		
		// 4. Using a for loop, print one char at time to the console.
int hello = 0;
for (int i = 0; i < length; i++) {
	System.out.println(s.charAt(hello));
	hello+=1;

}
		//    HINT: use .length() to determine how many loops

		
		// 5. Pick a char inside your String, and use a loop to determine
int line = 0;
for(int i; i < length; i++) {
s.charAt(line);
line+=1;


		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


