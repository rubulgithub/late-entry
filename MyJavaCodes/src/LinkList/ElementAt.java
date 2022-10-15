package LinkList;

class Node
{
    int data;
    Node next;
}
class A
{
    Node head;
    public void Element(int data)
    {
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=null;
        if(head==null)
        {
            head=newNode;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void Nth(int index)
    {
        Node temp=head;
        int count=0;
        while(temp.next!=null)
        {
            if(count==index)
                System.out.println("n : "+temp.data);
                count++;
            temp=temp.next;
        }
        System.out.println("node is not found :  ");

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

public class ElementAt
{
    public static void main(String []args)
    {
        A list=new A();
        list.Element(2);
        list.Element(5);
        list.Element(3);
        list.Element(6);
        list.Element(8);

        list.Nth(2);
        
        list.show();
    }   
}
