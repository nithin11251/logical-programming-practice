package arrays;
import java.util.*;
public class FindMissingElement {
	public static void main(String[] args) {
		int arr[]= {3,1,0,4};
		int n=arr.length-1;
		int sum=0;
		int natural=n*(n+1)/2;
		int index=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum-natural);
			
		}
	
	}


