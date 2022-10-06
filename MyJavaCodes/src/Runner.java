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
    public void InsertAtStart(int x)

    {
        Node node=new Node();
        node.x=x;
        node.next=null;
        node.next=head;
        head =node;

    }
    public void InsertAt(int index, int x)
    {
        Node node= new Node();
        node.x=x;
        node.next=null;

        Node temp=head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }
    public void DeleteAt(int index)
    {
        if(index==0)
        {
            head=head.next;
        }
        else
        {
        Node temp=head;
        Node temp1=null;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        temp1=temp.next;
        temp.next=temp1.next;
        System.out.println("n1 "+temp1.x);
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
    list.InsertAtStart(3);
    list.InsertAt(3, 45);
    list.DeleteAt(2);
    list.show();
    }
}

