package LinkList;

class Stack
{

    class Node
    {
        int data;
        Node next;
    
        public Node(int data )
        {
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    public void push(int data)
    {
        Node newNode= new Node(data);
        if(top==null)
        {
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }
    void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top=top.next;
        }
    }
    void show()
    {
        Node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class StackImp
{
    public static void main(String []args)
    {
        Stack list=new Stack();
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8 );

        list.pop();
        list.pop();

        list.show();
    }
}
