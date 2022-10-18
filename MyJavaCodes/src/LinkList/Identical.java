class Node
{
    int data;
    Node next;
}

public class Identical
{
    public boolean areIdentical( Identical L1, Identical L2)
    {
        Node a=L1.head, b=L2.head;
        while(a!=null&&b!=null)
        {
            if(a.data!=b.data)
            return false;
            a=a.next;
            b=b.next;
        }
        return(a==null && b==null);
    }
    Node head;
    public void Insert(int data)
    {
        Node newNode= new Node();
        newNode.data=data;
        newNode.next=null;
        if(head==null)
        {
            head=newNode;
        }
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
        Identical obj=new Identical();
        Identical L1=new Identical();
        Identical L2=new Identical();
        
        L1.Insert(1);
        L1.Insert(2);
        L1.Insert(3);
        L1.Insert(4);

        L2.Insert(1);
        L2.Insert(2);
        L2.Insert(3);
        L2.Insert(4);
        
        L1.show();
        L2.show();

        if (obj.areIdentical(L1,L2) == true)
            System.out.println("Identical ");
        else
            System.out.println("Not identical ");
        
    }
}
