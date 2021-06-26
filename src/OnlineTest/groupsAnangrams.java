package OnlineTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupsAnangrams {

	
	public static void main(String[] args) {
		 String[] words ={"eat", "tea", "tan", "ate", "nat", "bat","apple"};
		 groupOfAnagrams2(words);
		
	}
		static void groupOfAnagrams2(String[] words) {	  

		Map<Integer, List<String>> resultMap = new HashMap<Integer, List<String>>();
		
	        for (String value : words) {
	            char[] caharacters = value.toLowerCase().toCharArray();
	            int asciSum = 0;
	            for (char character : caharacters) {
	                asciSum += (int)character;
	            }
	            System.out.println(asciSum);
	            if(resultMap.containsKey(asciSum)) {
	            	
	            	 resultMap.get(asciSum).add(value);
	            	 System.out.println(resultMap);
	            }else {
	                List<String> list = new ArrayList<String>();
	                list.add(value);
	                resultMap.put(asciSum, list);
	            }
	        }
	        @SuppressWarnings({ "unchecked", "rawtypes" })
			List<String> result = new ArrayList(resultMap.values());
	       System.out.print(result);
	       
	     

	}

}
