import java.util.Scanner;
import java.util.Calendar;
import java.util.List;
import java.util.Arrays;




class date
{
  static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY") ;
  public static String getDay(String day, String month, String year)
  {
      int y = Integer.parseInt(year);
      int m = Integer.parseInt(month);
      int d = Integer.parseInt(day);

      Calendar c = Calendar.getInstance();
      c.set(y,m,d);

      int p=c.get(Calendar.DAY_OF_WEEK);
      String s=days.get(p-1);
      return s;
      


  }
 public static void main(String []args)
 {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter month: ");
    String month=in.next();
    System.out.println("Enter day : ");
    String day=in.next();
    System.out.println("Enter year : ");
    String year=in.next();
    System.out.println(getDay(day,month,year));
 }

 }   
