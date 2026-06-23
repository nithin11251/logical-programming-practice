package programing1;

public class productofdigit {
	public static int productOfDigit(int n) {
		int product=1;
		while(n>0) {
			int digit=n%10;
			product=product*digit;
			n=n/10;
		}
		return product;
	}
	public static void main(String[] args) {
		int n=243;
		productOfDigit(n);
		System.out.println(productOfDigit(n));
	}

}
