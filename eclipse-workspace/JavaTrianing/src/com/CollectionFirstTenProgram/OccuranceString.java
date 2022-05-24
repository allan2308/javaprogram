package com.CollectionFirstTenProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceString {
	public static void main(String[] args) {
		//Input = “testing” output = t-2, e-1,s-1,i-1 ,n-1, g-1
       String str = "testing";
       Map<Character,Integer> map= new LinkedHashMap<>();
       int count = 1;
       
       for(char ch:str.toCharArray()) {
    	   if(map.containsKey(ch)) {
    		    count =map.get(ch);
    		   map.put(ch, count+1);
    	   }
    	   else
    		   map.put(ch, 1);//t-1,e-2,s-1
    	   
       }
       System.out.println(map);
	}

}
