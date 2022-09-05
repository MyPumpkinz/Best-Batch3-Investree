import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 4, 4, 5, 6, 6};
        var duplicates = false;
        var max = arr[0];

        for (var j = 0; j < arr.length; j++) {
            for (var k = j + 1; k < arr.length; k++) {

                if (arr[k] == arr[j]) {
                    duplicates = true;
                    break;
                }

                if (j > max) {
                    max = j;
                }
            }
        }System.out.println("max array: " + max);
    }
}