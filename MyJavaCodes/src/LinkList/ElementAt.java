class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
 
class ElementAt
{
    Node head;
    public int GetNth(int index)
    {
        Node temp = head;
        int count = 1;
        while (temp != null)
        {
            if (count == index)
                return temp.data;
            count++;
            temp = temp.next;
        }
        return 0;
    }
    public void push(int new_data)
    {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    public static void main(String[] args)
    {
        ElementAt llist = new ElementAt();
 
    
        llist.push(1);
        llist.push(4);
        llist.push(1);
        llist.push(12);
        llist.push(1);
 
        System.out.println("Element at index 4 is "
                           + llist.GetNth(6));
    }
}

