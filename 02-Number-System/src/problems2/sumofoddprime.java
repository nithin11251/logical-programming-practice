package problems2;

public class sumofoddprime {   // total sum of odd digits is prime 
	public static boolean isPrimeOdd(int n) {
		int sum=0;
		int count=0;
		while(n>0) {
			int digit=n%10;
			if(digit%2==1) {
				sum=sum+digit;
				n=n/10;
			}
			for(int i=1;i<=sum;i++) {
				if(sum%i==0) {
					count++;
				}
			}
		}
		return count==2;
	}
	public static void main(String[] args) {
		int n=7;
		isPrimeOdd(n);
		if(isPrimeOdd(n)==true) {
			System.out.println("it is prime");
		}else {
			System.out.println("it is not prime");
		}
	}

}
