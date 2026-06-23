package Strings;

public class CountVowelsAndConsonents {

	public static void main(String[] args) {
	String s="abcde";
	int cc=0,vc=0;
	s=s.toLowerCase();
	for(int i=0;i<=s.length()-1;i++) {
		char ch=s.charAt(i);
		if(Character.isAlphabetic(ch)) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vc++;
			}else {
				cc++;
			}
		}

	}
	System.out.println("No of Vowels: "+vc);
	System.out.println("No of Cons: "+cc);

}
}
