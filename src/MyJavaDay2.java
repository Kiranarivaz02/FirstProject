
public class MyJavaDay2 {
	
	public static void main(String[] args) {
		  
		
//using break
		
// Initially loop is set to run from 0-9
		for(int i=0;i<10;i++) {
			if(i==5)
				break;
		    System.out.println("i: "+i);
		}
	    System.out.println("Loop complete.");
	    

//using continue
	    for(int i=0; i<10;i++) {
	    	// If the number is even
	    	//skip and continue
	    	if(i%2==0) 
	    		continue;
			    System.out.println(i+ " ");	
	    }

//using return
	    boolean t=true;
			    System.out.println("Before the return.");
	    if(t)
	    	return;
	    //complier will bypass , won't execute after return
	    System.out.println("This wont execute.");
  
	}
}



/*  Methods:

public class MethodsinJava {

//non return type method
void printBanner() {
    System.out.println("Inside non-return method");

}

//return type method
char printBanner() {
	return 'S';
}
static void loadData() {
	
}
}
class CallApp{
public static void main(String[] args) {
MethodsinJava ref = new MethodsInJava(); // object creation in java
ref printBanner();
char data=ref.printChar();
System.out.println(data);

}

void printNames(String ..x){


*/
