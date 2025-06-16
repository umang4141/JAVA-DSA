import java.util.*;
public class Union_of_Arrays_with_Duplicates {
    static int solve(int arr[], int[] arr1)
    {
       
        HashSet<Integer> h1 = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            h1.add(arr[i]);
        }

        for(int j=0;j<arr1.length;j++)
        {
            h1.add(arr1[j]);
        }

        return h1.size();

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr1[] = {1,2,3};
        // int k = 4
//        k_th_largest_element obj = new k_th_largest_element();
       int res =  solve(arr,arr1);
        System.out.println(res);
    }
}
