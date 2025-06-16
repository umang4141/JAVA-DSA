import java.util.*;
public class sort_012 {
    static void solve(int arr[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
        }

        int size = pq.size();
        for(int i=0;i<size;i++)
        {
            arr[i] = pq.poll();
        }

    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2};
        // int k = 4
//        k_th_largest_element obj = new k_th_largest_element();
        solve(arr);
        // System.out.println(ans);
    }
}
