package stringPrograms;

import java.util.HashMap;

public class FindDuplicateWords {
	public static void main(String[] args) {
		String str="ram siya ram siya ram jay jay ram";
		String s[]=str.split(" ");
		int count=0;
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		for(String s1:s)
		{
			if(map.containsKey(s1))
			{
				count++;
				map.put(s1, map.get(s1)+1);
			}
			else
			{
				count=1;
				map.put(s1, count);
			}
		}
		System.out.println(map);
	}

}
