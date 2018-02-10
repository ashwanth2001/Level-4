package def;

import java.util.ArrayList;

public class Anagram {

	public static void main(String[] args) {
		String s = "abc";
		ArrayList<String> a = new ArrayList<String>();
		System.out.println(s);
	}

	public static void anagram(ArrayList<String> out, String perm, String input) {
		int len = input.length();
		if (len == 0) {
			out.add(perm);
			System.out.println(perm);
		} else {
			for (int i = 0; i < len; i++) {
				perm = perm + input.charAt(i);
				anagram(out, perm, input.substring(0, i) + input.substring(i + 1));
			}
		}
	}
}
