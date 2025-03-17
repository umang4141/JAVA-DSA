import java.util.*;
public class maxproduct {

    public static int findmaxproduct(int arr[],int key)
    {
        Arrays.sort(arr);
        int maxproduct =  1;
        for(int i=0;i<key;i++)
        {
              maxproduct = maxproduct*arr[arr.length-i-1];
        }
        return maxproduct;
    }

    public static void main(String args[])
    {
        int arr[]= {1, 2, 3, 4};
        int key = 2;
        int res = findmaxproduct(arr,key);
        System.out.println(res);
    }
}
