import java.util.*;
public class k_th_largest_element {
    static int solve(int arr[],int k)
    {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i=0;i<k;i++)
            {
                pq.add(arr[i]);

            }
        for(int i=k;i<arr.length;i++) {
//            System.out.print(pq.peek()+" ");
//                3,4,7,10,15,20
                if(arr[i] > pq.peek())
                {
                    pq.poll();
                    pq.add(arr[i]);
                }

        }

        return pq.peek();


    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 20, 15};
        int k = 4;
//        k_th_largest_element obj = new k_th_largest_element();
        int ans = solve(arr,k);
        System.out.println(ans);
    }
}
