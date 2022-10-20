class Node
{
    int data;
    Node next;
}

public class DeleteAlternate
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
    public int DeleteAlt()
    {
        Node temp=head;
        while(temp!=null&&temp.next!=null)
        {
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return temp.data;
    }
    public void show()
    {
        Node newNode=head;
        while(newNode.next!=null)
        {
            System.out.println(newNode.data);
            newNode=newNode.next;
        }
        System.out.println(newNode.data);
    }
    public static void main(String []args)
    {
        DeleteAlternate L1=new DeleteAlternate();
        L1.Create(1);
        L1.Create(2);
        L1.Create(3);
        L1.Create(4);
        L1.Create(5);
        L1.Create(6);
        L1.show();
        System.out.println("Updated linked List : "+L1.DeleteAlt());

    }
}
