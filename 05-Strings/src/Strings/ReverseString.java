package Strings;

public class ReverseString {
//	public static String isReverse(String a){
	public static void main(String[] args) {
		String s="abcdef";
		System.out.println(isReverse(s));
	}

	
	// 1st approch Not recommended because of so many iterations
	
	/*public static String isReverse(String a) {
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			char ch=a.charAt(i);
			rev=rev+ch;
		}
		return rev;
	}*/
	
	//2nd approch recommed 
	
	public static String isReverse(String a) {
		char ch[]=a.toCharArray();
		int i=0,j=a.length()-1;
		while(i<j){
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		return new String(ch);
	}
	
	
	// 3rd approch advanced using StringBuffer
		
	/*StringBuffer sb=new StringBuffer(s);
	StringBuffer rev=sb.reverse();
	String str1=rev.toString();
	System.out.println(str1);
	*/
	}


