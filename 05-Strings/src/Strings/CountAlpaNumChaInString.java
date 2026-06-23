package Strings;

public class CountAlpaNumChaInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc@123";
		int alpha_count=0;
		int num_count=0;
		int spich_count=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z') {
				alpha_count++;
			}else if(ch>='0'&&ch<='9') {
				num_count++;
			}else {
				spich_count++;
			}
			
			}
		System.out.println(alpha_count);
		System.out.println(num_count);
		System.out.println(spich_count);
		
		
		// or use the builtin methods
		
//		for(int i=0;i<=s.length()-1;i++) {
//			char ch=charAt(i);
//			if(Character.isAlphabetic(ch))
//				alpha_count++;
//			else if(Character.isDigit(ch)) {
//				num_count++;
//				else
//					spich_count++;
//				
//			}
//		}

	}

}
