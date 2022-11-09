package Search;

class One
{
    public void OI()
    {
        int arr[]={0,0,0,0,0,1,0,0};
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            System.out.println("Index is : "+i);
        }
    }
}

public class OneIndex
{
    public static void main(String []args)
    {
        One obj=new One();
        obj.OI();
        
    }   
}
