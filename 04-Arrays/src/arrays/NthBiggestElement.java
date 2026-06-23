package arrays;

public class NthBiggestElement {
//problem still not complete
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,12,25,20,30};
		int big=2;
		for(int i=0;i<=a.length-1;i++) {
			int count =0;
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]){
					count = a[i];
				}
			}
			System.out.println(count);
		}


	}

}
