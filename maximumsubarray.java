import java.util.ArrayList;
import java.util.Collections;

public class maximumsubarray
{

    static int find_element_index(int arr[])
    {
        if (arr.length == 0) return 0;

        ArrayList<Integer> lis = new ArrayList<>();

        for (int num : arr) {
            int pos = Collections.binarySearch(lis, num);
            if (pos < 0) pos = -pos - 1; // Get the insertion point

            if (pos < lis.size()) {
                lis.set(pos, num); // Replace the existing element
            } else {
                lis.add(num); // Append new increasing element
            }
        }

        return lis.size();
    }
    public static void main(String args[])
    {

        int arr[] = {3, 4, 1, 0, 6, 2, 3};
//        int k = 4;
//        int n = arr.length;
        int ans  = find_element_index(arr);
        System.out.println(ans);
    }
}
