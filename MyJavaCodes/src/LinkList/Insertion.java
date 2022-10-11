package LinkList;

class Node 
{
    int data;
    Node next;
}
class LLs
{
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
}

public class Insertion 
{
    public static void main(String []args)
    {
        LLs list=new LLs();
        list.Insert(1);
        list.Insert(2);
        list.Insert(2);
        list.show();
    }
}
