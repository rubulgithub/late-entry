package Search;
import java.util.*;

class Ok
{
    public int NOO(int arr[],int n,int item)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==item)
                count++;
        return count;

    }
}
public class NumberOfOccurrence
{
    public static void main(String []args)
     {
       Ok obj=new Ok();

        int arr[]={1,2,3,3,4,4,4,4,7,8};
        System.out.println(obj.NOO(arr,10,3));

     }   
}
