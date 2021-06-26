package OnlineTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MatchBraces {
	public static boolean isBalanced(String s) {
	  Map<Character, Character> openClosePair = new HashMap<Character, Character>();
	    openClosePair.put(')', '(');
	    openClosePair.put('}', '{');
	    openClosePair.put(']', '[');

	    Stack<Character> stack = new Stack<Character>();
	    for(char ch : s.toCharArray()) {
	        if(openClosePair.containsKey(ch)) {
	            if(stack.isEmpty() || stack.pop() != openClosePair.get(ch)) {
	                return false;
	            }
	        } else if(openClosePair.values().contains(ch)) {
	            stack.push(ch); 
	        }
	    }
	    return stack.isEmpty();
	}
	public static void main(String[] args) {
		
		String str = "(({}))";//false,true
		boolean flag=isBalanced(str);
		System.out.println(flag);
	  	
	}

}
