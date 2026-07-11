
public class datatypes {
	
	public static void main (String args[]){
	
	byte value=0;
	short valu=1;
	int num=10;
	long num2=15;
	float floatval=20;
    double doubleval=30;
	char sent1='K';
	boolean val=false;
	String text="Bala sindhu";
	int[] age={23,80,77,30};
	
	
	System.out.println("\n--- DATA TYPES ---\n");
	
	System.out.println("\nPrimitive data types\n");
	
	System.out.println("Byte value ="+value);
	System.out.println("Short value ="+valu);
	System.out.println("Integer value ="+num);
	System.out.println("Long value ="+num2);
	System.out.println("Float value ="+floatval);
	System.out.println("Double value ="+doubleval);
	System.out.println("character ="+text);
	System.out.println("Boolean value ="+val);
	System.out.println("\nNon-Primitive data types\n");
	System.out.println("String : "+text);
	
	for(int i=0;i<age.length;i++){
		System.out.print("->"+age[i]);
		
	}
  }

}

