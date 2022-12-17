package Sorting;

import java.util.Scanner;

class SortingAlgo
{
    public void Sorting()
    {
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number Of Element : ");
        int n=sc.nextInt();
        System.out.println("Enter the Array Elements : ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int k=0;k<n-1-i;k++)
            {
                if(arr[k]>arr[k+1])
                {
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        System.out.println("Sorted Elements: ");
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}


public class BubbleSort
{
    public static void main(String []args)
    {
        SortingAlgo obj=new SortingAlgo();
        obj.Sorting();
    }
    
}
