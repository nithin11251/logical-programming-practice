package programing1;

public class primenumber {
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count==2;
	}
	public static void main(String[] args) {
		int n=7;
		boolean val=isPrime(n);
		if(val) {
			System.out.println("is prime");
			
		}else {
			System.out.println("not prime");
		}
	}
}
