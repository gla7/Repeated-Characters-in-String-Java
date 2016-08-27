
public class DataStructures8 {// REPEATED CHARACTERS ALGORITHM // this is an algorithm to check if a word has repeated characters in it

	public static void main(String[] args) {
		String a = "a";
		String b = "whatever";
		String c = "yes";
		String d = "no";
		String e = "surely";
		String f = "perpendicular";
		String g = "orthogonal";
		String h = "abcdefghijklmnopqrstuvwxyz1234567890,./;'[]-=";
		String k = "abcdefghijklmnopqrstuvwxyz1234567890,./;'[]-=a";
		String l = "table";
		System.out.println(hasDuplicateChars(a));
		System.out.println(hasDuplicateChars(b));
		System.out.println(hasDuplicateChars(c));
		System.out.println(hasDuplicateChars(d));
		System.out.println(hasDuplicateChars(e));
		System.out.println(hasDuplicateChars(f));
		System.out.println(hasDuplicateChars(g));
		System.out.println(hasDuplicateChars(h));
		System.out.println(hasDuplicateChars(k));
		System.out.println(hasDuplicateChars(l));
	}
	
	public static boolean hasDuplicateChars (String s) {
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length - 1; i++) {// we run through all of the array save the last letter, as we're gonna check that, for each character, if each other character matches it and if so, return true
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					return true;
				}
			}
		} // this algorithm does in the worst case scenario 1 + 2*(n-1)*3(n-1 + n-2 + n-3 + ... + 3 + 2 + 1) ~ 1 + 6(n-1)(n/2) ~ 3n^2 -3n + 1 ~ O(n^2)
		return false;
	}

}
