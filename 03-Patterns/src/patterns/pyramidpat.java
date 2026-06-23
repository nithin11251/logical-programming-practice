package patterns;

public class pyramidpat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=6;
		int sp=n-1;
		int st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
				}
			for(int k=1;k<=st;k++) {
				System.out.print("* ");
			}
			System.out.println();
			sp--;
			st=st+2;
		}*/
		
		//pattern number reverse payramid
		
		/*int n=6;
		int sp=0;
		int st=2*n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=st;k++) {
				System.out.print("* ");
			}
			System.out.println();
			sp++;
			st=st-2;
		}*/
		
		// Dimond pattern
		
		/*int n=7;
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
				
			}
			for(int k=1;k<=st;k++) {
				System.out.print("* "); // change * to number if put k it prints col valu andif put i it print row val 
			}
			if(i<=n/2) {
				sp--;
				st=st+2;
			}else {
				sp++;
				st=st-2;
				
			}
			System.out.println();
			*/
		
			//  I pattern 
			
		/*int n=7;
        int sp=0,st=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=st;k++){
                System.out.print("* ");
            }
            if(i<=n/2){
                sp++;
                st=st-2;
            }else{
                sp--;
                st=st+2;
            }
            System.out.println();
        }*/
		
		// number in odd and char in even in I pattern
		
		/*int n=7;
        
        int sp=0,st=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=st;k++){
                if(i%2==0){
                    System.out.print((char)(k+96)+" ");
                }else{
                    System.out.print(k+" ");
                }
            }
            if(i<=n/2){
                sp++;
                st=st-2;
            }else{
                sp--;
                st=st+2;
            }
            System.out.println();
        }*/
		
		//
    }
}
		
	


