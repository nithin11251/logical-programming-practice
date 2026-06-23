// Merge Two Arrays into Single Array by ZigZag Formate

package arrays;
import java.util.Arrays;
public class MergeTwoArraysIntoZigzag {
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int b[]={100,200,300,400,500};
		System.out.println(Arrays.toString(zigZag(a,b)));
		
	}
	public static int[] zigZag(int a[],int b[]) {
		
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<=a.length-1&&j<=b.length-1) {
			c[k]=a[i];
			k++;i++;
			c[k]=b[j];
			k++;j++;
		
		}
		while(i<=a.length-1) {
			c[k]=a[i];
			k++;i++;
		}
		while(j<=b.length-1) {
			c[k]=b[j];
			k++;j++;
		}
		
return c;
	}

}
