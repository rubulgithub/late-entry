import java.util.Scanner;

public class Smallest 
{
    public static void main( String []args)
    {
        Scanner sc=new Scanner(System.in);
        int r[]=new int[6];
        System.out.println("Enter Array Elemnets : ");
        for(int i=0;i<6;i++)
        {
            r[i]=sc.nextInt();
        }
       int min=r[0];
       for(int i=0;i<6;i++)
       {
            if(min>r[i])
            min=r[i];
       }
       System.out.println("Smallest Array Elemnets is : "+min);

    }
}
