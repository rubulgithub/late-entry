public class jaggedArray 
{
    public static void main(String []args)
    {
        int arr[][]={
            {3,8,6},
            {2,4,5,9},
            {1,3,}

        };
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
