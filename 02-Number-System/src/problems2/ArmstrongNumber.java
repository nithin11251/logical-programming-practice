package problems2;

public class ArmstrongNumber {
	public static boolean armStrong(int n) {
		int count=0;
		int temp=n;
		int check=n;
		int sum=0;
		int power=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		n=temp;
		while(n>0) {
			int digit =n%10;
			power=1;
			for(int i=1;i<=count;i++) {
			power=power*digit;
			sum=sum+power;
			n=n/10;
		
	
		}
		if(sum==check) {
			return true;
		}else {
			return false;
		}
	}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		armStrong(n);
		if(armStrong(n))
			System.out.println("It is armstrong");
		else
		System.out.println("Not armstrong Number");

	}
}
