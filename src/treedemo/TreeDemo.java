package treedemo;
 
public class TreeDemo {
		
		int[] arr;
 
		TreeDemo(int[] arr)
		{
			this.arr=arr;
		}
 
		public int getLeftIndex(int pos)
		{
			return arr[2*pos+1];
		}
 
		public int getRightIndex(int pos)
		{
			return arr[2*pos+2];
		}
 
 
		
		public static void main(String[] args) {
 
			int[] arr= {4,5,6,3,7,2,1,11,16,19,22};
  
			TreeDemo obj=new TreeDemo (arr);
			System.out.println(obj.getLeftIndex(0));
			System.out.println(obj.getRightIndex(0));
			System.out.println(obj.getLeftIndex(1));
			System.out.println(obj.getRightIndex(1));
			System.out.println(obj.getLeftIndex(2));
			System.out.println(obj.getRightIndex(2));
			System.out.println(obj.getLeftIndex(3));
			System.out.println(obj.getRightIndex(3));
			System.out.println(obj.getLeftIndex(4));
			System.out.println(obj.getRightIndex(4));		
 
 
			System.out.println("*****************************************");
		}
}
