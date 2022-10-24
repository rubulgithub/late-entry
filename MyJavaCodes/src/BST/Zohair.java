class Node
{
    int data;
    Node left;
    Node right;
}
class BST
{
    private Node root;
    public BST()
    {
        root=null;
    }
    public void Insertion(int val)
    {
       Node newNode=new Node();
       newNode.data=val;
       newNode.left=null;
       newNode.right=null;
        if(root==null)
       {
            root=newNode;
       }
       else 
       {
        Node temp=root;
        while(temp!=null)
        {
            if(val>temp.data) 
            {
                if(temp.right==null)
                {
                    temp.right=newNode;
                    break;
                }
                else
                temp=temp.right;
            }
            else if(val<temp.data)
                {
                    if(temp.left==null)
                    {
                        temp.left=newNode;
                        break;
                    }
                    else
                    temp=temp.left;
                }
                else
                {
                    System.out.println("Duplicate Values Are Not Allowed");
                    break;
                }
        }
       }
    }
    void preOrder() { preOrder(root); }
    public void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        
    }
    void inOrder() { inOrder(root); }
    public void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.println("\t"+root.data);
            inOrder(root.right);
        }
    }
    void postOrder() { postOrder(root); }
    public void postOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            inOrder(root.right);
            System.out.println(root.data);
        }
    }

}

public class Zohair
{
   public static void main(String []args)
   {
        BST list=new BST();
        Node root=null;
        list.Insertion(1);
        list.Insertion(7);
        list.Insertion(3);
        list.Insertion(2);
        list.Insertion(6);
        list.preOrder();
        list.inOrder();
        list.preOrder();

   } 
}
