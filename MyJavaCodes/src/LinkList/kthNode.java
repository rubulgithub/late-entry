class Node
{
int data;
Node next;
}
public class kthNode
{
    Node head;
    public void Create(int data)
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
    public void NdK(int k)
    {
        Node temp = head;
        int len = 0;
        while (temp.next!= null) 
        {
            len++;
            temp= temp.next;
        }
        int count=(len/k==0)?len/k:(len+1)/k;
        temp=head;
        for(int i=0;i<count-1;i++)
        {
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String []args)
    {
        kthNode list=new kthNode();
        list.Create(1);
        list.Create(2);
        list.Create(3);
        list.Create(4);
        list.Create(5);
        list.Create(6);

        list.NdK(2);
    }

}
