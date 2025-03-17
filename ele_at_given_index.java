public class ele_at_given_index
{

    static int find_element_index(int arr[], int key)
    {
        int num = 0;
        for(int i=0;i<arr.length;i++)
        {
               if(i==key)
                   num = arr[i];
        }
        return num;
    }
    public static void main(String args[])
    {

         int arr[] = {2,11,98,31,11,21,89,21};
         int key = 7;
         int ans  = find_element_index(arr,key);
         System.out.println(ans);
    }
}
