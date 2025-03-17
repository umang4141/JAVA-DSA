import java.util.*;
public class sortandmerge {

    public static int[] mergesort(int[] a1,int[] a2)
    {
       HashSet<Integer> h1= new HashSet<>();
       for(int i=0;i<a1.length;i++)
       {
           if(!h1.contains(a1[i]))
               h1.add(a1[i]);
       }
       for(int i=0;i<a2.length;i++)
       {
           if(!h1.contains(a2[i]))
               h1.add(a2[i]);
       }
       int[] result = new int[h1.size()];
        int index = 0;
        for (int num : h1) {
            result[index++] = num;
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String args[])
    {
        int a1[] = {11, 1, 8};
        int a2[] = {11,10};
        mergesort(a1,a2);
//        System.out.println(mergesort(a1,a2));
//        System.out.println(res);
    }
}
