package problems2;

public class NeonNumber {
	public static boolean neonNumber(int n) {
		int sum=0;
		int sqr=n*n;
		while(sqr>0) {
			int digit=sqr%10;
			sum=sum+digit;
			sqr=sqr/10;
			

		}
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		neonNumber(n);
		if(neonNumber(n)==true) {
			System.out.println("it is neon Number");
		}else {
			System.out.println("it is not neon Number");
		}

	}

}
