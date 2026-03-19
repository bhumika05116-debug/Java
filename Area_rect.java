import java.util.*;
public class Area_rect
{
 public static void main(String args[])
 {
   int l,b,Area;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter length:");
  l=sc.nextInt();
  System.out.println("Enter breadth:");
  b=sc.nextInt();
 Area=l*b;
  System.out.println("The Area of the rectangle: "+Area);
}
}