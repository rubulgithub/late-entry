import java.util.Scanner;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many terms: ");
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) 
        {
			System.out.println("Enter a: ");
			int a = sc.nextInt();
			System.out.println("Enter b: ");
			int b = sc.nextInt();
            System.out.println("Enter n: ");
			int n = sc.nextInt();

			int sum = a;
			System.out.println("Sum of the Series : ");
			for (int j = 0; j < n; j++)  //j=0 ,  a= 3, b= 2, n=3
            {
				sum += b * Math.pow(2, j); //sum= 3+2*2^0=5
				System.out.println( +sum);
			}
			System.out.println();
		}
    }
}