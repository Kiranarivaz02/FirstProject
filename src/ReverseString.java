// "betty bought some better butter, but it was bitter butter"
public class ReverseString {

	public static void main(String[] args) {
		String a="betty bought some better butter, but it was bitter butter";
		StringBuilder d=new StringBuilder(a);
		StringBuilder result=d.reverse();
		 
		System.out.println(result.toString());
		
		//without reverse fun
		
		String reverse="";
		for(int i=0;i<a.length();i++) {
			reverse=a.charAt(i)+ reverse;
		}
		System.out.println(reverse);
		

	}

}
