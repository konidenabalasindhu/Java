
/*Convert an integer into binary , hexadecimal , octal.*/

import java.util.Scanner;

public class Stringconversion {
	public static void main(String args[]){
		
	Scanner num=new Scanner(System.in);
	int Number = num.nextInt();
	
	System.out.println(Number + " in binary : "+ Integer.toBinaryString(Number));
	
	System.out.println(Number + " in hexadecimal : "+ Integer.toHexString(Number));
	
	System.out.println(Number + " in octal : "+Integer.toOctalString(Number));
	
	}
}	