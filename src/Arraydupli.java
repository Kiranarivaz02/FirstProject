//{2,4,6,4,5,8,9,1,9,10}

public class Arraydupli {
	public static void main(String [] args) {
		int [] ar={2,4,6,4,5,8,9,1,9,10};
		
		for(int i=1;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
			if(ar[i]==ar[j]) {
				System.out.println(ar[i]);
				
			}
			}
			
		}
		
	}

}
