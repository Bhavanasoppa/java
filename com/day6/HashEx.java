package com.day6;
import java.util.*;
public class HashEx {

	public static void main(String[] args) {
		HashMap<String,Integer> hashmap=new HashMap<String,Integer>();
		HashMap<String,Integer> hm=new HashMap<String,Integer>();

		hashmap.put("one",new Integer(1));
		hashmap.put("two",new Integer(2));
		hashmap.put("three",new Integer(3));
		hashmap.put("three",new Integer(5));
		hashmap.put(null,new Integer(4));
		hm.putAll(hashmap);
		System.out.println(hashmap);

		System.out.println("HashMap contains" +hashmap.size()+ "key value pairs");

		//Finding particular value from the HashMap
		if(hashmap.containsValue(new Integer(1))){
			System.out.println("HashMap contains 1 as value");
		}
			else{
				System.out.println("HAshMap does not contain 1 as" +  "value");
		}
		
		//Finding particular key from the HAshMap
		if(hashmap.containsKey(null)){
			System.out.println("HashMap contains null as key");
		}
		else{
			System.out.println("HashMap does not contain null as key");
		}
Integer o=(Integer) hashmap.get("one");
System.out.println("value mapped with key\"one\"" + "is" +o);

System.out.println("Retrieving all keys from" + "the hashmap");
Iterator<String> iterator=hashmap.keySet().iterator();
while(iterator.hasNext()){
	System.out.println(iterator.next());
}

System.out.println("Retrieving all key value pairs frist");
Iterator<Map.Entry<String,Integer>> itr=hashmap.entrySet().iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("Hash Map's values");
Iterator<Integer> i=hashmap.values().iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}

System.out.println("Using enhanced for loop");
for(String aKey:hashmap.keySet())
{
	Integer aValue=hashmap.get(aKey);
	System.out.println(""+aKey+ ":" +aValue);
}

System.out.println("Using enhanced for loop for values");
for(Integer val:hashmap.values())
{
	System.out.println(val);
}

HashSet<String> hs=new HashSet<String>();
hs.addAll(hashmap.keySet());

System.out.println("hs :" +hs);
	}

}
