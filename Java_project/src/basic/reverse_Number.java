package basic;

public class reverse_Number {
	public static void main(String [] args) {
		int reverse=0;int j=12134;int i=j;
		for(;i!=0;i/=10) {
			int reminder =i%10;
			reverse=reverse*10+reminder;
			
		}
		if(reverse==j) {
		System.out.println("Enter no is palindrome "+reverse);
	}
		else {
			System.out.println("Enter no is not pallindrome "+ reverse);
//			double power=Math.pow(2, 5);
//			System.out.println(power);
		}
	}
}
