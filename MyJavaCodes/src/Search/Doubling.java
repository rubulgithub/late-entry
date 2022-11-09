package Search;

class DoublingTheValue
{
    public int DTV(int b)
    {
        int arr[]={1,3,6,7,5};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==b)
            {
                b=b*2;
            }

        }
        return b;
    }
}

public class Doubling
{
    public static void main(String []args)
    {
        DoublingTheValue obj=new DoublingTheValue();
        System.out.println(obj.DTV(3));
    }   
}
