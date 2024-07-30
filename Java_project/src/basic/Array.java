package basic;

public class Array {
	public static void main (String [] args) {
//		int a1[]=new int[7];
//		a1[0]=10;
//		a1[1]=20;
//		a1[2]=70;
//		a1[3]=30;
//		a1[4]=40;
//		a1[5]=50;
//		a1[6]=60;
//		
//		System.out.println(a1.length);
//		System.out.println(a1[0]);
//	
//		for(int i=0;i<=a1.length-1;i++) {
//			System.out.println(a1[i]);
//			System.out.println("-----------------------------");
//		}
		
		
//		int[] a= {1,2,3,4,5,6,7,8,9,3};
//		System.out.println(a.length);
//		System.out.println(a[2]); 
//		
		
//		int arr[]={50,60,70,80};  
//		for(int i=0;i<=arr.length;i++){  
//		System.out.println(arr[i]);
//	}
		
		int arr[]={4,4,5};  
		//getting the class name of Java array  
		Class c=arr.getClass();  
		String name=c.getName();  
		//printing the class name of Java array   
		System.out.println(arr.getClass());  
		System.out.println(name);
		
		}
}
