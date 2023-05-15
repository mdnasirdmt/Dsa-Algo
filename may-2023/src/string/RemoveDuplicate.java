package string;

import java.util.Arrays;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
        String[] str = {"abc", "def", "ghi", "abc", "def"};
        
        String[] uniqueArray = removeDuplicates(str);

        System.out.println(Arrays.toString(uniqueArray));
    }
	public static String[] removeDuplicates(String[] str) {
        int n = str.length;
        int uniqueCount = n;
        
        for (int i = 0; i < n; i++) {
            if (str[i] != null) {
                for (int j = i + 1; j < n; j++) {
                    if (str[i].equals(str[j])) {
                        str[j] = null;  // Mark duplicate elements as null
                        uniqueCount--;
                    }
                }
            }
        }
        
        String[] uniqueArray = new String[uniqueCount];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            if (str[i] != null) {
                uniqueArray[index++] = str[i];
            }
        }
        
        return uniqueArray;
    }

}
