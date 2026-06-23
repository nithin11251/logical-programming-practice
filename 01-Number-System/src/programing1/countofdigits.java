package programing1;

public class countofdigits {
	public static int countOfDigit(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=243;
		countOfDigit(n);
		int result=countOfDigit(n);
		System.out.println(result);

	}

}
