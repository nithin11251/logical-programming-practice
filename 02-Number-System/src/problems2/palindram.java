package problems2;

public class palindram {
	public static boolean ispalindram(int n) {
		int rev=0;
		int temp=n;
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(rev==temp)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		int n=121;
		if(ispalindram(n)) {
			System.out.println("is palindram");
		}else {
			System.out.println("not palindram");
		}
		
		
	}

}
