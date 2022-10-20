class Node
{
int data;
Node next;
}
public class Sum 
{
    Node head;
    public void Create(int data)
    {
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=null;
        if(head==null)
        head=newNode;
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public int sumOfNodes()
    {
    Node node=head;
    int sum=0;
    if(node==null)
    return 0;
    while(node!=null)
    {
    sum=sum+node.data;
    node=node.next;
    }
    return sum;
   }
   public static void main(String []args)
   {
    Sum list=new Sum();
    list.Create(1);
    list.Create(2);
    list.Create(3);
    list.Create(4);
    list.Create(5);
    System.out.println("Sum is : "+list.sumOfNodes());
   }
}
