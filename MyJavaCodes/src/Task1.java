import java.util.Scanner;


public class Task1 
{
    public static void main(String []args)
    {
        int n;
        System.out.print("Enter the Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        {
            if(n>=2&&n<=5)
            {
                System.out.println("Not Weird");
            }
            else if(n>=6&&n<=20)
            {
                System.out.print("Weird");
            }
            else if(n>20)
            {
                System.out.print("Not Weird");
            }
        }
        else
        {
            System.out.print("Weird");
        }
        
    }
}
