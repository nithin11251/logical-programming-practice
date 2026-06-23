package programing1;

public class sumofdigit {
	public static int sumOfDigit(int n) {
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
			
		}
	return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=234;
		sumOfDigit(n);
		//int result=sumOfDigit(n); // or store method in variable and print that variable
		System.out.println(sumOfDigit(n)); // print method name directly
		
		

	}

}
