import java.util.List;
import java.util.*;
public class listsmall {
    static int smallnum(int x,List<Integer>arr)
    {
       int count = 0;
       for(int i=0;i<arr.size();i++)
       {
           if(arr.get(i)<x)
           {
               count++;
           }
       }
       return count;
    }
    public static void main(String args[])
    {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(2);
        l1.add(8);
        l1.add(5);
        int num = 10;
        int res = smallnum(num,l1);
        System.out.println(res);

    }
}
