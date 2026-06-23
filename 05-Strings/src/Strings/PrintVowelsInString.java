package Strings;

public class PrintVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		for(int i=0;i<=s.length()-1;i++) {
			char ch= s.charAt(i);
			String c="aeiouAEIOU";
			if(c.indexOf(ch)!=-1) {
				System.out.println(ch);
			}

			
			
		}

	}

}
