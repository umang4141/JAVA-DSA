import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubarray {

    public static int findLongestIncreasingSubarray(List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0; // Handle empty or null list case
        }

        int maxLength = 1; // At minimum, any single element is an increasing subarray
        int currentLength = 1;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1; // Reset for new potential subarray
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(1);
        arr.add(2);

        int result = findLongestIncreasingSubarray(arr);
        System.out.println("Length of longest increasing subarray: " + result);
    }
}
