package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String  str) {
		char[] array = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			array[i]=str.charAt(str.length()-i-1);
		}
		return array;
	}
	
	public static void printCharArray(char[] array) {
		String result="";
		for(char value : array) {
			result+=String.valueOf(value);
		}
		System.out.println(result);
	}
}