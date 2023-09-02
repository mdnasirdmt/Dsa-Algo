package mostAskedQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		String s="aaccbbeedd"; //output= abcde

		String[] ch1 = s.split("");
		
//		ArrayList<String> al= new ArrayList<>(Arrays.asList(ch1));
		
		ArrayList<String> cc= new ArrayList<>();
		
		for (int i = 0; i < ch1.length; i++) {
			
			if(!cc.contains(ch1[i]))
				cc.add(ch1[i]);
		}
		System.out.println(cc);
		
		
		
		
		
	}

}
//remove duplicate from string 
//if id String s="aaccbbeedd"; //output= abcde