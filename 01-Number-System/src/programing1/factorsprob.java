package programing1;

public class factorsprob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=10;
		int count=1; //add n here for last digit
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				sum=sum+i;// sum of the factors
				count++;//count the factors
			}
		}
		System.out.println(n);
		
		System .out.println(sum + n +" sum of factors");
		System.out.println(count);


	}

}
