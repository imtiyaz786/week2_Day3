package mywork;

import java.util.*;
import java.util.Map.Entry;

public class SentenceArrangement
{

	//private static final int Integer.MAX_VALUE = 0;

	public static void main(String[] args)
	{

	
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T != 0) {
			int X = s.nextInt();
			
			int count = 0;
			if (X < 10)
				System.out.print(-1 + " ");
			else {
			
			for (int i = X; i <= Integer.MAX_VALUE; i= i * 2)
				if (X%10 != 0)
				{	
					count++;
					continue;
					
				}
			}
					
			System.out.print(count + " ");	
		}
	}

		
		
		


	

	
	


	/*public static String sortSentenceBasedOnVowelCountAndReverseOrder(String s) {
		
		Map <Integer, String> map = new TreeMap<>();
		String ar[] = s.split(" ");
		Arrays.sort(ar, Collections.reverseOrder());
		
		for (String w : ar)
		{
			int count = 0;
			String str = w.toLowerCase();
			for (int j = 0; j < str.length(); j++)
			{	
				if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u')
					count++;
			}
					
			
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
			
		
	}*/
	
}
