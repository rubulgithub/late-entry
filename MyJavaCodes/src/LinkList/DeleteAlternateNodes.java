class Node
{
    int data;
    Node next;
}

public class DeleteAlternateNodes
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
    public Node DeleteAlt()
    {
        Node temp=head;
        while(temp!=null&&temp.next!=null)
        {
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return head;
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
        DeleteAlternateNodes L1=new DeleteAlternateNodes();
        L1.Create(1);
        L1.Create(2);
        L1.Create(3);
        L1.Create(4);
        L1.Create(5);
        L1.Create(6);
        L1.show();
       
        L1.DeleteAlt();
  
        System.out.println("Linked List after calling ");
        L1.show();
    }
}
