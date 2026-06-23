package Strings;

public class StringIspalindromeareNot {
	public static boolean isPalindrome(String s) {
		//1st best approch recommeded
		
		/*int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i) !=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		
	}
		return true;
		*/
		
	//2nd approch  not recommeded
		
		char ch[] = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        if (new String(ch).equals(s)) {
            return true;
        } else {
            return false;
        }
        
        // 3rd approch 
        //return s.equals(new StringBuffer(s).reverse().toString());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aba";
		if(isPalindrome(s)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is not Palindrome");
		}

	}

}
