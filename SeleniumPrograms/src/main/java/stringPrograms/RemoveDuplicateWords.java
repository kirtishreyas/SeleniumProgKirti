package stringPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String str="India is my country india country";
		String result=" ";
		String str1=str.toLowerCase();
		System.out.println(str1);
		String s1[]=str1.split(" ");
		LinkedHashSet<String>set=new LinkedHashSet<>();
		for(String s:s1)
		{
			set.add(s);
			}
		System.out.println(set);
		Iterator it=set.iterator();
		while (it.hasNext()) 
		{
			result=result+it.next()+" ";
		}
		System.out.println(result);
		
		
		
	}

}
