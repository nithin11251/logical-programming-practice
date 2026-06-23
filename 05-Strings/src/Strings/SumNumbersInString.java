package Strings;

public class SumNumbersInString {
	public static int sumDigits(String s) {
		int sum=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				sum=sum+ch-48;  // -Asiic value
				//or
				// sum=sum+Character.getNumericValue(ch);
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc123";
		System.out.println("Sum of digits In String: "+sumDigits(s));
		

	}

}
