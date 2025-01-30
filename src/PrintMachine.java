
public class PrintMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Printer p=new  Printer();// error
		
		
		Printer p= new LaserPrinter();
		
	
		System.out.println(p.print());
		
		Scanner sc=new LaserPrinter();
		
		System.out.println(sc.scanCopy());
		
		
		LaserPrinter Lp=new LaserPrinter();
		
		System.out.println(Lp.scanCopy());
		
		System.out.println(Printer.nop);
		
		
		
}

}