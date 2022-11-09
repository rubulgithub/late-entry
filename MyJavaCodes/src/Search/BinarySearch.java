package Search;

import java.util.Scanner;

class Searching
{
    public void Search()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Element : ");
        int n=sc.nextInt();
        System.out.println("Enter the Array Element : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the Number To be Search: ");
        int item=sc.nextInt();
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            int m=(l+r)/2;
            if(item==arr[m])
            {
            System.out.println("Item Found....."+m);
            return;
            }
            else if(item>arr[m])
            l=m+1;
            else
            r=m-1;
        }
        System.out.println("Item not found......."); 

    }
}
public class BinarySearch
{
    public static void main(String []args)
    {
        Searching obj=new Searching();
        obj.Search();
        
    }   
}
