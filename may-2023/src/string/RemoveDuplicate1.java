package string;

import java.util.Arrays;

public class RemoveDuplicate1 {
	public static void main(String[] args) {
		String[] str = {"abc", "def", "ghi", "abc", "def"};
		int c=0;
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++) {
			
			if(i==0) {
				c++;
			}
			else if(!str[i].equals(str[i-1])) {
				c++;
			}
			
		}
		
//		System.out.println(c);
		
		String[]str1= new String[c];
		int index=0;
		for (int i = 0; i < str.length; i++) {
			if(i==0) {
				str1[index++]=str[i];
			}else if(!str[i].equals(str[i-1])) {
				str1[index++]=str[i];
			}
		}
		
		System.out.println(Arrays.toString(str1));
	}

}

//The time complexity of the algorithm is O(n log n) because of the sorting step.
