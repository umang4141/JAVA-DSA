import java.util.*;
public class maxmum_distinct {

    public static int sort_array(int  arr[]) {
//        HashMap<Integer, Integer> h1 = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            h1.put(arr[i], h1.getOrDefault(arr[i], 0) + 1);
//        }
//
////        for (Map.Entry<Character, Integer> entry : h1.entrySet()) {
//////            System.out.println(entry.getKey() + " " + entry.getValue());
////        }
//
//        // Convert HashMap to List
//        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(h1.entrySet());
//
//        // Sort by values in descending order
////        String newstr = "";
//        int newarray[] = new int[arr.length];
//        int count = 0;
//        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
//        for (Map.Entry<Integer, Integer> entry : list) {
//            System.out.println("Character: " + entry.getKey() + " -> Frequency: " + entry.getValue());
//            if (entry.getValue() > 1) {
//
//                for (int i = 0; i < entry.getValue(); i++) {
//                    newarray[count++] = entry.getKey();
//                }
//
//            } else {
//                newarray[count++] = entry.getKey();
//            }
////            Arrays.sort(newarray);
//        }
//            for(int i=0;i<newarray.length;i++) {
//                System.out.println(newarray[i]);
//            }
//            System.out.println(h1);
////            return newstr;
//            Arrays.sort(newarray);
//
////        }
        HashSet<Integer> h1 = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            h1.add(arr[i]);
            System.out.println(h1);
        }

        return h1.size();
    }
    public static void main(String args[])
    {
        int arr[]= {0,0,1,1,1,2,2,3,3,4};
//        String str = "tree";
        System.out.println(sort_array(arr));
//        sort_array(str);
    }
}
