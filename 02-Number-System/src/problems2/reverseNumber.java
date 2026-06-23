package problems2;

public class reverseNumber {
	public static int revNum(int n) {
		int rev=0;
		while(n>0) {
			int digit=n%10;
			rev= rev*10+digit; ;  //rev= rev * 10 + digit
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int n=123;
		revNum(n);
		System.out.println(revNum(n));
	}

}
