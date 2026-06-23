package arrays;

import java.util.Arrays;

public class SortArrayInDecending {
	
		public static void main(String[] args) {
			int a[]= {10,30,20,40,15};
			for(int i=0;i<=a.length-1;i++) {
				for(int j=i+1;j<=a.length-1;j++) {
					if(a[j]>a[i]) {
						int temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
			}
				System.out.println(Arrays.toString(a));

}
	}

