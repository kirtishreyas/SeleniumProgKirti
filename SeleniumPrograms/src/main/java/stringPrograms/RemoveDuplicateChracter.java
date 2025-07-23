package stringPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateChracter {
	public static void main(String[] args) {
		String str="application";
		String result=" ";
		char ch[]=str.toCharArray();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(char c:ch)
		{
			set.add(c);
		}
		System.out.println(set);
		Iterator it=set.iterator();
		while (it.hasNext()) {
			result=result+it.next();
			
		}
		System.out.println(result);
	}

}
