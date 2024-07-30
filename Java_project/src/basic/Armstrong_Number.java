package basic;
import java.util.Scanner;
public class Armstrong_Number {
	public static void main (String [] args) {
		Scanner s= new Scanner(System.in);
		int no=s.nextInt();
		int count=0;double temp1=0; int amno=no;
		// no=153
		for(int i=121;i>0;i/=10) {
			count=count+1;
		}
		System.out.println("power "+count);
		
		for(;no>0;no/=10) {
			 int reminder=no%10;
			 temp1 = temp1+Math.pow(reminder, count);
		}
		System.out.println("addition of nos power "+temp1);
		if(temp1==amno) {
			System.out.println(temp1+" = true");
		}
		else {
			System.out.println(temp1+" =false");
		}
	}

}
