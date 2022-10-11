import java.util.Scanner;

public class ThirtdLargest 
{
    public static void main(String []args)
    {
    Scanner sc=new Scanner(System.in);
    int max;
    int r[]=new int[6];
    System.out.println("Enter the Array Element :");
    for(int i=0;i<6;i++)
    {
        r[i]=sc.nextInt();
    }
    max=r[0];
    for(int i=0;i<6;i++)
    {
        if(r[i]>r[max]);
        max=r[i];
    }
    int result=r[0];
    for(int i=1;i<6;i++)
    {
        if(r[i]!=max)
        {
            if(r[i]>r[result])
            result=r[i];
        }
    }
    int res=r[0];
    for(int i=0;i<6;i++)
    {
        if(r[i]!=max && r[i]!=result)
        {
            if(r[i]>r[res])
            res=r[i];
        }
    }
    System.out.println("The Third Largest Array Element is :" +res);   
}
}
