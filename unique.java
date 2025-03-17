import java.util.*;
public class unique {

    public static ArrayList<Integer> unique(int arr[])
    {
        HashSet<Integer> h1 = new HashSet();
        for(int i=arr.length-1;i>0;i--)
        {
            if(!h1.contains(arr[i]))
                h1.add(arr[i]);
        }

        ArrayList<Integer> list = new ArrayList<>(h1);

        return list;

    }

    public static void main(String args[])
    {
        int arr[]= {8, 8, 6, 2, 1};

        unique(arr);
    }
}
