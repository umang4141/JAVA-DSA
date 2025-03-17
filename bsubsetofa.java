import java.awt.desktop.SystemEventListener;
import java.util.HashSet;

public class bsubsetofa {
    public static boolean isSubset(int a[], int b[]) {
        // Your code here
        int count = 0;
        HashSet<Integer> h1 = new HashSet<>();
        for(int i=0;i<a.length;i++) {
            if(!h1.contains(a[i]))
            {
                h1.add(a[i]);
            }
        }
//        System.out.println(h1);
        for(int i=0;i<b.length;i++)
        {
            if(!h1.contains(b[i]))
            {
                count++;
            }
        }
        if(count>0)
            return false;
        else
            return true;

    }
    public static void main(String args[])
    {
        int a[] = {10, 5, 2, 23, 19};
        int b[] = {19, 5, 3};
        System.out.println(isSubset(a, b));
//        isSubset(a,b);
    }
}
