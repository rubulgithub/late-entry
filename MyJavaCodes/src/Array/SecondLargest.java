import java.util.Scanner;

public class SecondLargest
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
        int result=-1;
        for(int i=0;i<6;i++)
        {
            if(r[i]!=max)
            {
                if(result==-1)
                result=r[i];
                else if(r[i]>r[result])
                result=r[i];
            }
        }
        System.out.println("The Second Largest Array Element is :" +result);

    }
}
