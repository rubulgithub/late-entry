package Sorting;

class Sorting {
    void Swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    int Partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
  
        int start = low;
        int end = high;
        while(start<end)
        {
            while(arr[start]<pivot)
            {
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }
            if(start<end)
            {
                Swap(arr,start,end);
            }
        Swap(arr,start,end);
        return end;
        }
    }
    void quickSort(int[] arr, int start, int end)
    {
        if (start < end)
        {
            int pi = Partition(arr, start, end);

            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }
    void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
}
public class QuickSort2 
{
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        Sorting obj=new Sorting();
        obj.quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        obj.printArray(arr, n);
    }
}

