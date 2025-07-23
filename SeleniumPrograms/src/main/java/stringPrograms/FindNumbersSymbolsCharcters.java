package stringPrograms;

public class FindNumbersSymbolsCharcters {
	public static void main(String[] args) {
		String str="bin123@%$go";
		String charcters=str.replaceAll("[^a-zA-Z]", "");
		System.out.println(charcters);
		
		String numbers=str.replaceAll("[^0-9]", "");
		System.out.println(numbers);
		
		String symbols=str.replaceAll("[0-9a-zA-Z]", "");
		System.out.println(symbols);
	}

}
