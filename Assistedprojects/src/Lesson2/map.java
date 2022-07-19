package Lesson2;

import java.util.*;

public class map {
	public static void main(String[]args)
	{
		Map<String,Integer>map=new HashMap<>();
		
		
		map.put("Aishu",21 );
		map.put("Sarah", 20);
		map.put("Riya", 18);
		for(Map.Entry< String, Integer>e:map.entrySet())
			System.out.println(e.getKey() + "  "+e.getValue());
		   
	}

}
