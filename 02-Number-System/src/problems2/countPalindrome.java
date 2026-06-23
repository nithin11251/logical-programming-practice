package problems2;

public class countPalindrome {
	public static boolean isPalindrome(int n) {
		int rev=0;
		int temp=n;
		
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(rev==temp) {
			
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=500;i++) {
			isPalindrome(i);
			if(isPalindrome(i)) {
				count++;
			}
		
		}
		System.out.println(count);
	}

}
