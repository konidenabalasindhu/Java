import java.util.Scanner;

public class conversion {
	
	public static void main(String args[]){
		
		System.out.println("\nConversion : Pounds to Kgs.\n"); 
		
		Scanner sc = new Scanner(System.in);
		
		int pound=sc.nextInt();
		
		System.out.println("\nPounds: " +pound);
		
		double kg=pound*0.453592;
	
		
		System.out.println( pound +" Pounds = " +kg+ " kgs."); 
		
		sc.close();
		
	}
}