class Project
{
    public void show()
    {
        System.out.println("in show");
    }
    public Project()
    {
        System.out.println("In Constructor");
    }
}
public class A
{
    public static void main(String []args)
    {
        Project obj=new Project();
        obj.show();
    }   
}
