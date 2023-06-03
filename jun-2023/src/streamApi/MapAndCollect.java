package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollect {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
		
		List<String> str= list.stream().map(number -> String.valueOf(number)).collect(Collectors.toList());
		
		System.out.println(str);

	}

}
