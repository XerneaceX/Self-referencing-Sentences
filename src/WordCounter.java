public class WordCounter {
    public static String[] words = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty", "hundred", "thousand"};

    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
    public static char[] consonants = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

    String sentence;
    int vowelCount = 0;
    int consonantCount = 0;

    private boolean charIsInArray(char ch, char[] chars) {
        for (char c : chars) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }

    private void countLetters() {
        for (char c : sentence.toCharArray()) {
            if (charIsInArray(c, vowels)) {
                vowelCount++;
            } else if (charIsInArray(c, consonants)) {
                consonantCount++;
            }
        }
    }

    public WordCounter(String sentence) {
        this.sentence = sentence;
        this.vowelCount = 0;
        this.consonantCount = 0;
    }


    public static void main(String[] args) {
        WordCounter wc = new WordCounter("This is a sentence");
        wc.countLetters();
    }
}
