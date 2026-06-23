package arrays;
import java.util.*;
public class SortArrayInAsscending {
	public static void main(String[] args) {
		int a[]= {10,30,20,40,15};
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println(Arrays.toString(a));
//			Arrays.sort(a);
//			System.out.println(a[i]);
				}	
			}
		
	


