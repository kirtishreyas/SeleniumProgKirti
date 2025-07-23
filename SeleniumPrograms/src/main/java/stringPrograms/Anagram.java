package stringPrograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "rakhi";
		String str2="khira";
	
		String s1=str1.replaceAll(" ", "");
		String s2=str2.replaceAll(" ", "");
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		Boolean result=Arrays.equals(ch1, ch2);
		if(result==true)
			System.out.println("anagram");
		else
			System.out.println("not anagram");
		
	}

}
