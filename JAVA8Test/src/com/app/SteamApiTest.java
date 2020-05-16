package com.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SteamApiTest 
{
	public static void main(String[]args)
	{
		/*
		 * ArrayList<Integer> l1 = new ArrayList<Integer>(); for(int i=0;i<=10;i++) {
		 * l1.add(i);
		 * 
		 * } System.out.println(l1); ArrayList<Integer> l2 = new ArrayList<Integer>();
		 * for(Integer i:l1) { if(i%2==0) { l2.add(i); } System.out.println(l2); }
		 */
		
		//using java 8
		
		/*
		 * ArrayList<Integer> l1 = new ArrayList<Integer>(); for(int i=0;i<=10;i++) {
		 * l1.add(i); } System.out.println(l1); List<Integer> l2 =
		 * l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		 * System.out.println(l2);
		 */
		
		//uses of map in java 8 making it as upper case using map
		
		/*
		 * ArrayList<String> l2 = new ArrayList<String>(); l2.add("ravi"); l2.add("rk");
		 * l2.add("rkv"); l2.add("rvki"); l2.add("rvkir"); System.out.println(l2);
		 * 
		 * List<String> l3 =
		 * l2.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		 * System.out.println(l3);
		 */
		
		//Before Java 8 
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "lineod.com");
		map.put(2 ,"heroku.com");
		
		String result="";
		for(Map.Entry<Integer, String> entry : map.entrySet())
		{
			if("something".equals(entry.getValue()))
			{
				result = entry.getValue();
			}
		}
		
		// MAP-> Stream -> Filter ->String
		// 	}Copy With Java 8, you can convert a Map.entrySet() into a stream, follow by a filter() and collect() it.
		
		String result1 = map.entrySet().stream().filter(x-> "lineod.com".equals(x.getValue())).map(x-> x.getValue()).collect(Collectors.joining());
		System.out.println(result1);
		
		//Map -> Stream -> Filter -> MAP
		Map<Integer, String> collect = map.entrySet().stream()
				.filter(x -> x.getKey() == 2)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		System.out.println(collect);
				
		// or like this
		Map<Integer, String> collect1= map.entrySet().stream()
			.filter(x -> x.getKey() == 3)
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(collect1	);
		
	}

}
