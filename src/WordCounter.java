import java.lang.reflect.Array;

public class WordCounter {

    public static String[] words = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred", "thousand", "million"};

    public static int[] wordValues = new int[]{0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50, 60, 70, 80, 90, 100, 1000, 1000000};
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
    public static char[] consonants = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

    String initialStatement;
    int vowelCount;
    int consonantCount;

    private boolean charIsInArray(char ch, char[] chars) {
        for (char c : chars) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }

    private void countLetters() {
        char[] str = this.initialStatement.toCharArray();
        for (char c : str) {
            if (charIsInArray(c, vowels)) {
                this.vowelCount++;
            } else if (charIsInArray(c, consonants)) {
                this.consonantCount++;
            }
        }
    }

//    public int[] countLetters() {
//        int cc = 0;
//        int vc = 0;
//
//        char[] str = this.initialStatement.toCharArray();
//        for (char c : str) {
//            if (charIsInArray(c, WordCounter.vowels)) {
//                vc++;
//            } else if (charIsInArray(c, WordCounter.consonants)) {
//                cc++;
//            }
//        }
//        return new int[]{cc, vc};
//    }

    public WordCounter(String statement) {
        this.initialStatement = statement;
        this.vowelCount = 0;
        this.consonantCount = 0;
        countLetters();
    }

    public void newStatement(String statement) {
        this.initialStatement = statement;
    }

    public String findSolution(int counter) {
        String newStatement = this.initialStatement;

        if (new WordCounter(newStatement).vowelCount == counter) {
            System.out.println("Solution: " + newStatement);
        } else {
            System.out.println("Wrong Solution: " + newStatement);
            System.out.println(new WordCounter(newStatement).vowelCount);
            findSolution(counter + 1);
        }

        return newStatement;
    }


    public String findSolution() {
        return findSolution(0);
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter("aaaabc ");
        wc.findSolution();
    }
}
