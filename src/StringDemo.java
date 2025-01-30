import java.util.StringTokenizer;

public class StringDemo {


	public static void main(String[] args) {
		String a="Kiran";
		String b=new String("Kiran");
		//check address is same
		if(a==b) {
			System.out.println(a.hashCode());
			System.out.println(b.hashCode());

			System.out.println("Same Location");
		}
		else {
			System.out.println(a.hashCode());
			System.out.println(b.hashCode());
			System.out.println("Different Location");

		}
		//check strings are .equals
		if(a.equals(b)) {
			System.out.println("Same String");	
		}
		else {
			System.out.println("Different String");

		}
		
		//String Token .. It consider everything as string
		StringTokenizer w=new StringTokenizer("Happy New Year,to All,Welcome to Training",",");
		//usedelimiter(",");
		int countToken=w.countTokens();
		System.out.println(countToken);
		while(w.hasMoreTokens()) {
			System.out.println(w.nextToken());
		}
		
	}

	private static void usedelimiter(String string) {
		// TODO Auto-generated method stub
		
	}

}
