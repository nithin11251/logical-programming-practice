package Strings;
// Not completed problem
public class ConvertUCToLCandLCtoUC {

	public static void main(String[] args) {
		String s="abcABC123";
		char ch[]=s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char)(ch[i]-32); //97-32=65
			}else if(ch[i]>='A'&& ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32); //65+32=97
			}

			}
		System.out.println(ch);
		
		// 2nd approch by using String builtin methods
		
		for(int i=0;i<=ch.length-1;i++) {
			if(Character.isUpperCase(ch[i])) {
				ch[i]=Character.toLowerCase(ch[i]);
			}else if(Character.isLowerCase(ch[i])) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);
			
			
				
			}

	}



