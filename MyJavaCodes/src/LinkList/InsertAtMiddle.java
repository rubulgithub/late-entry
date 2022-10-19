class Node
{
    int data;
    Node next;
}

public class InsertAtMiddle
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
    public void pushAtMiddle(int data)
    {
        Node newNode=new Node();
        newNode.data=data;
        if(head==null)
        {
        head=newNode;
        }
        else
        {
            Node temp = head;
            int len = 0;
            while (temp.next!= null) 
            {
                len++;
                temp= temp.next;
            }
        int count=((len%2)==0)?len/2:((len+1)/2);
        temp=head;
        while(count-->1)
        {
        temp=temp.next;
        }
        newNode.next=temp.next;
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
        InsertAtMiddle list=new InsertAtMiddle();

        list.Create(1);
        list.Create(2);
        list.Create(3);
        list.Create(4);
        list.Create(5);
        list.pushAtMiddle(1);
        list.show();
    }
}
