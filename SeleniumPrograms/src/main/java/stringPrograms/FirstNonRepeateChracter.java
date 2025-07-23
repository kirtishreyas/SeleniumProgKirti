package stringPrograms;

public class FirstNonRepeateChracter {
	public static void main(String[] args) {
		String str="success";
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			if(str.indexOf(c)==str.lastIndexOf(c))
			{
				System.out.println("uniq charcter=" +c);
				break;
			}
		}
		
	}
	


}
