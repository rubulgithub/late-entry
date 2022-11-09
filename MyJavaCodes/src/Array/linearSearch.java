package Array;

import java.util.Scanner;

class Search
{
    public void Seq_Search()
    { 
        int flag=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Element : ");
        int arr[]=new int[7];
        for(int i=0;i<7;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the Number To be Search: ");
        int Item=sc.nextInt();
            
        for(int i=0;i<7;i++)
        {
            if(arr[i]==Item)
            {
                flag=0;
                System.out.println("Item is found : ");
                break;
            }
        }
        if(flag==1)
        System.out.println("item Is not Found");
    }
}

public class linearSearch
{
    public static void main(String []args)
    {
        Search obj=new Search();
        obj.Seq_Search();
    }
}
