package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
	public static void main(String[] args) {
		String str="successfull";
		int count=0;
		char ch[]=str.toCharArray();
		HashMap<Character,Integer>map=new HashMap<>();
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				count++;
				map.put(c, map.get(c)+1);
			}
			else
			{
				count=1;
				map.put(c, count);
			}
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}

}
