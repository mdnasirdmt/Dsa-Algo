package mostAskedQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.List.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int []arr= {5,8,4,2,15,5,2,7,8,7,1,3};
		List<Integer> list= new ArrayList<>();
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			if(!list.contains(arr[i]))
				list.add(arr[i]);
		}
		System.out.println(list);
		
		
	}

}

/*
 * remove the number that is more than once for example arr[ ] = {1,2,4,5,1,2}
 * output= 1,2,4,5
 */