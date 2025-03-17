public class allzwithfive {

    static void convert_to_five(int num)
    {
        String str = Integer.toString(num);
        String newstr = "";
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='0')
            {
                newstr+='5';
            }
            else {
                newstr+=str.charAt(i);
            }
        }
        System.out.println(Integer.valueOf(newstr));
    }
    public static void main(String args[])
    {
        int num = 1004;
        convert_to_five(num);
    }
}
