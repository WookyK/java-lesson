package homework.day5;

public class CountingMatches {
	public static void main(String[] args) {
		String str = "HELLO WORld";
		int upperCaseLetters = 0;
		for (int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)){
				upperCaseLetters++;
				System.out.println(upperCaseLetters);
			}
		}
	}

}
