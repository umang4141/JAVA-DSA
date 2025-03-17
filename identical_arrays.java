import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class identical_arrays {

    public static boolean identical_arrays_problem(List<Integer> a,List<Integer> b) {
        HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();
        if(a.size()!=b.size()) return false;

        int count = 0;
        for (Integer item : a) {
            h1.put(item,h1.getOrDefault(item, 0) + 1);
        }
        for(Integer item:b)
        {
            h1.put(item,h1.getOrDefault(item, 0) - 1);
        }
        System.out.println(h1);

        for (Map.Entry<Integer, Integer> entry : h1.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
            if(entry.getValue()!=0) count++;
        }
        if(count>0)
            return false;
        else
            return true;
//        return true;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(4);
        arr1.add(1);
        arr1.add(2);
        arr1.add(5);
        System.out.println(identical_arrays_problem(arr,arr1));
//        identical_arrays_problem(arr,arr1);
//        System.out.println("Length of longest increasing subarray: " + result);
    }
}
