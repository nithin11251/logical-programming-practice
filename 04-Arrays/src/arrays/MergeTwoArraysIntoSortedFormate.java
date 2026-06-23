//Merge Two Arrays into Single Array in Sorted Formate Not Use Arrays.sort

package arrays;
import java.util.Arrays;
public class MergeTwoArraysIntoSortedFormate {
	public static void main(String[] args) {
	int a[]= {1,5,10};
	int b[]={2,4,5,7,15};
	System.out.println(Arrays.toString(isSorted(a,b)));
}
	public static int[] isSorted(int a[],int b[]) {
	
	int c[]=new int[a.length+b.length];
	int i=0,j=0,k=0;
	while(i<=a.length-1&&j<=b.length-1) {
		if(a[i]<b[j]) {
		c[k]=a[i];
		k++;i++;
		}else {
		c[k]=b[j];
		k++;j++;
		}
	
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
