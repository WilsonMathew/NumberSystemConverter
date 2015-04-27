public class NumberConverter {

// suffix
// Binary = b
// Decimal = d
// Octal = o
// Hexadecimal = h
/**
 * if I have a Binary, it need to be converted to Decimal, Octal and Hexadcimal.
 *
 * Let's start with the simplest operations which is to convert a binary to a Octal.
 * 100101 octal. --->  45
 *
**/
	public static void main(String[] args) {
		System.out.println(B_ToOctal(args[0]));
		System.out.println("abc".substring(1,2));
	}

	/**
	* This method will convert any number into binary format
	*
	**/	
	public static String B_ToOctal(String hello) {

		int binary_length = hello.length();	

		//  Make the binary a multiple of 3
		while(binary_length%3!=0) {
			hello= "0" + hello;	
			binary_length = hello.length();
		}

		// Determine how many octates I have.
		int n_octates = binary_length/3;

		// substring starts at index 0 and ends at index-1;
		int binary_begin=0;
		int binary_end=3;
		
		int i = 1;

		// split it into groups
		while(i <= n_octates) {
			String temp = hello.substring(binary_begin,binary_end);
			binary_begin+=3;
			binary_end+=3;
			i++;
			System.out.println(temp);
		}

		return hello;
	} 

	public static String ConverBinary(String number) {

		// determine what number it is

		// if decimal then 
		// do process to convert to binary
		// else if ocatal
		// do process to convert to binary
		// else if hexadecimal 
		// do process to convert to binary
	
		return "binary number";
	}
}
