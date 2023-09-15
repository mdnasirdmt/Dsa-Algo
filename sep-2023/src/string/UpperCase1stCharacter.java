package string;

public class UpperCase1stCharacter {

	public static void main(String[] args) {
		String s = "my name is nasir and i am a boy "; // output= My Name Is Nasir And I Am A Boy

		String[] sArr = s.split(" ");

		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < sArr.length; i++) {

			sb.append(Character.toUpperCase(sArr[i].charAt(0)));
			sb.append(sArr[i].substring(1));

			if (i < sArr.length - 1) {
				sb.append(" "); // Add space between words
			}

		}

		System.out.print(sb);
	}

}
