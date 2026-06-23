package arrays;
import java.util.*;
// find the occurance are frequance of each element in the array

public class numberoccerrance {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,10,50,40};
		boolean b[]= new boolean[a.length];
		for(int i=0;i<=a.length-1;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<=a.length-1;j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(a[i]+" "+count);
				
//To find unique Element in array use if count ==1 print element or Non repeted array of
				// first Non repeted Elements use break under sopln.
				
			/*if(count==1) {
				System.out.println(a[i]);
			}*/
				
//To find duplicate Elements in array use if count >1 print element 
				/*if(count>1) {
					System.out.println(a[i]);
				}*/
				
		}
	}

}
}
