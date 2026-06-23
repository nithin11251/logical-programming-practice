package programing1;
import java.util.*;
public class perfectNumber {
	public static void isPerfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}if(sum==n) {
			System.out.println("is perfect number");
		}else {
			System.out.println("not a perfect number");
		}
	}
	public static void main(String[] args) {
		int n=6;
		isPerfect(n);
		}
	}


