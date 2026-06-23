package problems2;

public class strongNumber {
	public static boolean isStorng(int n) {
		int sum=0;
		int temp=n;
		while(n>0) {
			int digit=n%10;
			int fact=factorial(digit);
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp) {
			return true;
		}else {
			return false;
		}
	}
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145;
		if(isStorng(n)) {
			System.out.println("It is storng Number");
		}else {
			System.out.println("is Not storng Number");
		}

	}

}
