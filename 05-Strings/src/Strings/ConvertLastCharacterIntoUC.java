package Strings;

public class ConvertLastCharacterIntoUC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "my work is done";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			if(i==ch.length-1||ch[i+1]==' ') {
				ch[i]=Character.toUpperCase(ch[i]);
			}else {
				ch[i]=Character.toLowerCase(ch[i]);
			}
		}
		System.out.println(ch);

	}

}
