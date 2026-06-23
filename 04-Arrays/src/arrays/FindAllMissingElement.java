package arrays;
import java.util.*;
public class FindAllMissingElement {
	public static void main(String[] args) {
		int arr[]= {5,1,7,3,10};
		int small=arr[0];
		int big=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<small) {
				small=arr[i];
			
			}if(arr[i]>big) {
				big=arr[i];
			}
		}
		
	
		
		for(int i=small;i<=big;i++){
			if(isMissing(i,arr)) {
				System.out.println(i);
			}
		}
	}
	
		 public static boolean isMissing(int target,int a[]) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]==target) {
					return false;
				}
			}
					return true;
				}
			
			
		
	}
		 
			
		 
		 


	


