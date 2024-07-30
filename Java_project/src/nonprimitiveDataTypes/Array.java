package nonprimitiveDataTypes;

import java.util.Scanner;

public class Array {

	public static void main(Strings[] args) {
//		 
//		int [] marks=new int[3];
//	//	int[] marks1= {30,50,35};
//		 marks[0]=70;
//		 marks[1]=75;
//		 marks[2]=80;
//		 
//		 System.out.println(marks[0]);
//		 System.out.println(marks[1]);
//		 System.out.println(marks[2]);
//		 
//		 for(int i=0;i<3;i++)
//		 {
//			System.out.print(marks[i]+" "); 
//			System.out.println(marks.length);
//		 }	
//		 
		 
		 // takes the input from user
		 Scanner s= new Scanner(System.in);
		 int size=s.nextInt();
		 int numbers[]=new int[size];
		 for(int i=0;i<size;i++)
		 {
			 System.out.println(numbers[i]=s.nextInt());
		 }

		 for(int i=0;i<size;i++)
		 {
			System.out.print(numbers[i]+" "); 
			 
		 }	
		 
		 
	}

}
