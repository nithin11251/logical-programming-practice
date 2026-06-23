package Strings;

public class FindLongestUniqueSubstringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="scanner";
		String longest="";
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i;j<=s.length();j++) {
				String sub=s.substring(i,j);
				if(isUnique(sub)) {
					if(sub.length()>longest.length()) {
						longest=sub;
					}
				}
			}
		}
		System.out.println(longest);

	}
	public static boolean isUnique(String s) {
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i+1;j<=s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
