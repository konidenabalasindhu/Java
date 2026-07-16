/*class Sum{

    public static void main (String args[]){

		int n=1000,sum=0,count=0;
		for(int i=1;n>=i;i++){
			if(count!=5){
				if(i%3==0 && i%5==0){
					sum+=i;
					count++;
				}
			}
		}
		System.out.println(sum);
	}
}*/

public class Sum{

    public static void main(String args[]){

    findsum();
}

    public static void findsum(){

    int sum=0;
    int count=0;

    for(int i=1;i<=1000;i++){
   
    if( i%3==0 && i%5==0){
 
    System.out.println(i);
    sum+=i;
    count++;

    if(count==5){
   break;
}

    }

  }

  System.out.println("Sum : "+sum);

}
}

