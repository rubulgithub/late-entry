import java.util.Scanner;

public class Multiples 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int N=sc.nextInt();
        System.out.println("Multiples are :");
        for(int i=1;i<=10;i++)
        {
            int M;
            M=N*i;
            System.out.println(+M);
        }
    }
    
}