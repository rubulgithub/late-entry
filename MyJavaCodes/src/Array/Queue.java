public class Queue
{
    int queue[]=new int[5];
    int size;
    int front;
    int rear;
    public void enqueue(int data)
    {
        queue[rear]=data;
        rear=rear+1;
        size=size+1;
    }   
    public void show()
    {
        System.out.println("Elements : ");
        for(int i=0;i<size;i++)
        {
            System.out.println(queue[i]+ " ");
        }
    }
    public static void main(String []args)
    {
        Queue Q=new Queue();
        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
        Q.enqueue(4);
        Q.enqueue(5);
        Q.show();
    }
}
