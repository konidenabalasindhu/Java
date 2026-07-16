import java.util.Scanner;

public class variable1{
	
	public static void main(String args[]){
		
		System.out.println("\n--- LOCAL VARIABLE ---\n");
		
		Scanner name=new Scanner(System.in);
		String Name=name.nextLine();
		
		System.out.println("\nName of the person : " +Name+"\n");
		
	    Scanner age = new Scanner (System.in);
        int Age = age.nextInt();
		
		System.out.println("\nAge of the person : " +Age);
		
        System.out.println( "\n"+Name + " is "+Age+" years old.");
		
		if (Age>=18){
			
			System.out.println("\n"+Name+ " is eligible to enter the club.");
			
			}
		else{
			
			System.out.println("\n"+Name+" is not eligible to enter the club.");
			
			}
		
}
		
}		