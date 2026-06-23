package Strings;
 
// Q) find  Longeest pallindrome substring in the String

public class FindLongestPalindromeSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abacabad";
		String longest=""; //to store longest pall sub string
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i;j<=s.length();j++) {
				String sub=s.substring(i,j);
				if(ispalindrome(sub)) {
					if(sub.length()>longest.length()) {
						longest=sub;
					}
				}
			}
		}
		System.out.println(longest);
		

	}
	public static boolean ispalindrome(String s) {
		return s.equals(new StringBuffer(s).reverse().toString());
	}

}
