import java.util.Scanner;

public class Alternate 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the Array Element : ");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is :" );
        for(int i=0;i<5;i=i+2)
        System.out.println(arr[i]+" ");
    }   
}
