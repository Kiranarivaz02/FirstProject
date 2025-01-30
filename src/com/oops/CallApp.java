package com.oops;
class MethodsInJava {
		
		// Methods:
		 
		//non return type method
		void printBanner() {
		    System.out.println("Inside non-return method");

		}

		//return type method
		char printChar() {
			return 'S';
		}
		
		static void loadData() {
		    System.out.println("Pr-loading...");

		}
		
		void printNames(String name1,String name2,String name3) {
			//method to print few names
		    System.out.println(" "+name1 +" "+name2+" "+name3);
		}
		//lets improvise this method
		void printNames_1(String names[]) {
		for(String allnames:names) {
        System.out.println(allnames);
		}
		}
		
		 //lets improvise this method var-args 1.5 version
		void printNames_2(String ...x){
			for(String allnames:x) {
		        System.out.println(allnames);
			}
			}

			
		class CallApp{
		public static void main(String a[]) {
		MethodsInJava ref = new MethodsInJava(); // object creation in java
		ref.printBanner();
		char data=ref.printChar();
		System.out.println(data);
		MethodsInJava.loadData();
		
		String names[]= {"Kiran","Harishma","Prema"}; // array declaration for Strings
		ref.printNames("Kiran","Harishma","Prema");
		ref.printNames_1(names);
		ref.printNames_2("Kiran","Harishma","Prema","lucky","Archana","kamali","Arivaz");

		}
		}
		

}
