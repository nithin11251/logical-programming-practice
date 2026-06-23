package problems2;

public class sumofstrongnumbers {
	public static boolean isStrong(int n) {
		int sum=0;
		int temp=n;
		while(n>0) {
			int digit = n%10;
			int fact=1;
			for(int i=1;i<=digit;i++) {
					fact=fact*i;
			}
					sum=sum+fact;
					n=n/10;
				}
			
			
		if(sum==temp){
			return true;
			
		
		}else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalsum=0;
		for(int i=1;i<=1000;i++) {
			isStrong(i);
			if(isStrong(i)) {
				totalsum=totalsum+i;
			}
		}
		System.out.println(totalsum);

	}

}
