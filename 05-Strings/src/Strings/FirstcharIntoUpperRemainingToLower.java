package Strings;

public class FirstcharIntoUpperRemainingToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rAm iS gOod";
		char ch[]=s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(i==0||ch[i-1]==' ') {
			ch[i]=Character.toUpperCase(ch[i]);
			}else {
				ch[i]=Character.toLowerCase(ch[i]);
			}
		}
		
		System.out.println(ch);

	}

}
