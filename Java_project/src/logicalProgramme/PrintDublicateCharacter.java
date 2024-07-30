package logicalProgramme;

public class PrintDublicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="AutomationA";
		int count = 0;
		char [] s= s1.toCharArray();
		
		
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j <  s.length; j++) {
                if(s[i]==s[j]) {
                System.out.println(s[i]);
                count++;
                }
			}

		}
		System.out.println(count);

	}
}