import java.util.Scanner;

public class Largest 
{
    public static void main(String []args)
    {
        int max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements :");
        int []r=new int[6];
        for(int i=0;i<6;i++)
        {
            r[i]=sc.nextInt();
        }
        max=r[0];
        for(int i=0;i<5;i++)
        {
            if(r[i]>max)
            {
                max=r[i];
            }
        }
        System.out.println("Maximum Element of the Array is : "+max);
    }   
}
