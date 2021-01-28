import java.util.ArrayList;
import java.util.Arrays;
import java.util.*; 

 
public class ReverseList.java 
{
    public static void main(String[] args) 
    {
      
      ArrayList<String> laptops = new ArrayList<String>();
      laptops.add("Razer");
      laptops.add("Apple");
      laptops.add("Surface");
      laptops.add("Asus");
      laptops.add("Samsung");
      
     
      System.out.println(laptops);
      Collections.reverse(laptops); 
      
      System.out.println("Reversed: " + laptops); 
      
    }
}
