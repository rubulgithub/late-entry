
class Node
{
    int data;
    Node next;
}
class A
{
    Node head;
    public void NON(int data)
    {
        Node newNode=new Node();
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
        int count=0;
        Node newNode=head;
        while(newNode.next!=null)
        {
            count++;
            System.out.println(+newNode.data);
            newNode=newNode.next;
        }
        count++;
        System.out.println(+newNode.data);
        System.out.println("Number of Nodes : "+count);
    }
}

public class NumberOfNodes
{
    public static void main(String []args)
    {
        A obj=new A();
        obj.NON(2);
        obj.NON(3);
        obj.NON(4);
        obj.NON(5);
        obj.NON(6);
        obj.show();
        
    }   
}
