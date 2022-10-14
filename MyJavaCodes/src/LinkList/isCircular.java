package LinkList;

class Node
{
	int data;
	Node next;
    Node(int d)
	{
		data = d;
		next = null;
	}
}

class GfG
{
    boolean Circular(Node head)
    {
        if(head == null)
        return true;
    Node temp = head.next;
    while(temp != null && temp != head )
    
        temp = temp.next;
    return (temp == head);

    }
}

public class isCircular 
{
    public static void main(String []args)
    {
        GfG list=new GfG();
        list.Circular();
    }
}
