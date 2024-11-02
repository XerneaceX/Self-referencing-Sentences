import java.util.Arrays;

public class Utils {
    public static int findIndex(String[] arr, String t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(t)) {
                return arr.length;
            }
        }
        return -1;
    }
}
