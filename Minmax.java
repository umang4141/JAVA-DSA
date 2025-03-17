import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

class Minmax
{
    public static void main(String args[])
    {
        int min = MAX_VALUE;
        int max = MIN_VALUE;
        int arr1[] = {2,1,33,12,91,22,12};
        for(int i=0;i<arr1.length;i++)
        {
              if(arr1[i]>max)
              {
                  max= arr1[i];
              }
              else if(arr1[i]<min)
              {
                  min= arr1[i];
              }
        }
        System.out.println(max + " " + min);


    }
}
