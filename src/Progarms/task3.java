package Progarms;

import java.util.Stack;

public class task3 {

	public static boolean isValid(String s) {
	 Stack<Character> leftSymbols = new Stack<>();
	 for (char c : s.toCharArray()) {
		  if (c == '(' || c == '{' || c == '[') {
		                leftSymbols.push(c);
		  }
		    else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
		        leftSymbols.pop();
		  } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
		        leftSymbols.pop();
		  } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
		        leftSymbols.pop();
		  }
		  else {
		         return false;
		       }
	 }
	  return leftSymbols.isEmpty();
  }
		    	   
	 public static void main(String[] args) {
		 System.out.println(isValid(")"));
		 System.out.println(isValid("{([])}"));
		 System.out.println(isValid("(]"));
		 System.out.println(isValid("([)]"));
	     System.out.println(isValid("{[]}"));
		 }		
	}


