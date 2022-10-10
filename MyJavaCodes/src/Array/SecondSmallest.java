import java.util.Scanner;

public class SecondSmallest 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter The Array Element : ");
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<6;i++)
        {
            if(min>arr[i])
            min=arr[i];
        }
        int result=-1;
        for(int i=0;i<6;i++)
        {
            if(min!=arr[i])
            {
                if(result==-1)
                result=arr[i];
                else if(arr[i]<arr[result])
                result= arr[i];
            }

        }
        System.out.println("Seconfd Smallest Element in the Array is : "+result);
    }   
}
