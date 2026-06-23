package Strings;

import java.util.HashMap;

public class FindOccerancOrFrequanceOfEachCha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabcdb";
		// 1st approch not recommeded more time complexity
		/*char ch[]=s.toCharArray();
		boolean b[]=new boolean[ch.length];
		for(int i=0;i<=ch.length-1;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<=ch.length-1;j++) {
					if(ch[i]==ch[j]) {
						count++;
						b[j]=true;
					}
				}
			
			System.out.println(ch[i]+" "+count);
			}
		}*/
		
		// 2nd approch it is recommeded
		int freq[]=new int[128];
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			freq[ch]++;
		}
		for(int i=0;i<=freq.length-1;i++) {
			if(freq[i]>0) {
				System.out.println((char)i+" "+freq[i]);
			}

		}
		
		
		// 3rd approch using collection
		HashMap<Character, Integer>m=new HashMap();
		/*for(char ch:s.toCharArray()) {
			m.put(ch,  m.getOrDefault(ch, 0)+1);
		}
		System.out.println(m);*/
		

	}

}
