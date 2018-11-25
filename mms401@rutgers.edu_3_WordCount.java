public class WordCount {
	public static int countWords(String original, int minLength){
		
		if (original.isEmpty() || minLength < 0) {
			IO.reportBadInput();
			return 0;
		}

		int count = 0;

		original = original.replaceAll("[^a-zA-Z]+", " ");

		String[] words = null;
		
		words = original.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() >= minLength) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(countWords("My name //// %@%#^ is %/35anthony hahaha gonzalvez", 4));
	}
}