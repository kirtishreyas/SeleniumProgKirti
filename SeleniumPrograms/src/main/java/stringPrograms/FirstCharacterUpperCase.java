package stringPrograms;

public class FirstCharacterUpperCase {
	public static void main(String[] args) {
		String str="kirti shreyas joshi";
		String s1[]=str.split(" ");
		String ans=" ";
		for(String s:s1)
		{
			int length=s.length();
			String first=s.substring(0,1).toUpperCase();
			String rest=s.substring(1,length-1).toLowerCase();
			String last=s.substring(length-1,length).toUpperCase();
			 ans=ans+first+rest+last+" ";
		}
		System.out.println(ans);
	}

}
