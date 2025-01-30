/*class Printer {
	Printer() {
		//this("c:
		System.out.println("Inside Default");
	}
	Printer(String path, String imgname, String fname){
		this(fname);
		System.out.println("Path:"+" "+imgname);
	}

	Printer(String txtfile){
		this();
		System.out.println("File"+ " "+txtfile);
		}
	public class Printers{
	public static void main(String[] args) {
		new Printer("asd.txt","hi","file");
	}

	}
}
*/

public interface Printer 
{
int nop=5;
String print();

}