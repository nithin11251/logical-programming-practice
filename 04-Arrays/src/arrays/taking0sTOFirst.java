package arrays;
import java.util.*;
public class taking0sTOFirst {
	public static void main(String[] args) {
		int arr[]= {0,10,0,5,0,20};
		int index=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index--;
			}
		}
			for(int i=index;i>=0;i--) {
				arr[i]=0;
			}
			System.out.println(Arrays.toString(arr));
		}
	}


