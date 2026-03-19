import java.util.*;
public class Area_Circle
{
 public static void main(String args[])
 {
   double R,Pi=3.14,Area;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Radius:");
  R=sc.nextInt();
 Area=Pi*R*R;
  System.out.println("The Area of the Circle: "+Area);
}
}