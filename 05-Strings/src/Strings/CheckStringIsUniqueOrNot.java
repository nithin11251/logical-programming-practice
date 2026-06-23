package Strings;

public class CheckStringIsUniqueOrNot {
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
	public static void main(String[] args) {
		String s="abcde";
		if(isUnique(s)) {
			System.out.println("String is unique");
		}else {
			System.out.println("String is Not Unique");
		}
	}

}
