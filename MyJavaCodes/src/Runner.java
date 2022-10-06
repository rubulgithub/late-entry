class Node
{
    int x;
    Node next;
}
class LLs
{
    Node head;
    public void Insert(int x)
    {
        Node node=new Node();
        node.x=x;
        node.next=null;

        if(head==null)
        {
            head=node;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;

        }
    }
 public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.println(node.x);
            node=node.next;
        }
        System.out.println(node.x);
    }

}


public class Runner 
{
    public static void main(String []args)
    {
    LLs list=new LLs();
    list.Insert(4);
    list.Insert(5);
    list.Insert(6);
    list.Insert(7);
    list.show();
    }
}

