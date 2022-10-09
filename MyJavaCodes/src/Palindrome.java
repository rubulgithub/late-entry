import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Palindrome 
{
 public static void main( String []args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your String");
    String str=sc.next();
    String org_str=str;
    String rev="";
    int l=str.length();
    for(int i=l-1;i>=0;i--)
    {
        rev=rev+str.charAt(i);

    }
    if(org_str.equals(rev))
    {
        System.out.println("String is Palindrome");
    }
    else
    {
        System.out.println("String is not palindrome");
    }
}
}