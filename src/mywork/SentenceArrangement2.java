package mywork;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

public class SentenceArrangement2 {

	public static void main(String[] args) {
		
		String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";

		System.out.print(s);
		
	}
	
	
	public static String sortSentenceBasedOnUniqueVowelCountAndReverseOrder(String s ) {
		
		Map <Integer, String> map = new TreeMap<>();
		String ar[] = s.split(" ");
		Arrays.sort(ar, Collections.reverseOrder());
		
		for (String w : ar)
		{
			String str = w.toLowerCase();
			Set<Character> uniqueCount = new HashSet<>();
			

			
			for (int j = 0; j < str.length(); j++)
			{	
	
				if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u')
				{
					uniqueCount.add(str.charAt(j));
					
				
				}
			} 
			int count = uniqueCount.size();
					
			
			if (map.containsKey(count))
			{
				String temp=map.get(count);
				temp=temp+" " + w;
				map.put(count, temp);
			}
			else 
				map.put(count, w);
		}
		
		StringBuilder sb = new StringBuilder();
		for (Entry<Integer, String> e: map.entrySet())
			sb.append(e.getValue()).append(" ");
		
		return sb.toString().trim();

	}

}
