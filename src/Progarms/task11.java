package Progarms;

import java.util.ArrayList;
import java.util.List;

public class task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String s = "abcadcccda";
	      int start = 0;
	      int end = 0;
	      int max_length = 0;
	      List<Character> list =new ArrayList<Character>();
	      
	      while(end<s.length()) 
	      {
	    	  if(!list.contains(s.charAt(end)))
	    	  {
	    		  list.add(s.charAt(end));
	    		  end++;
	    		  max_length=Math.max(max_length, list.size());
	    	  }
	    	  else
	    	  {
	    		  list.remove(Character.valueOf(s.charAt(start)));
	    		  start++;
	    	  }    	  
	      }
	      System.out.println("maximum length is " +max_length);
		  System.out.println("maximum length is ");
		 System.out.println("length is ");
		  }

	}


