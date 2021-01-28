import java.util.ArrayList;
import java.util.Arrays;

 
public class CombineList 
{
    public static void main(String[] args) 
    {
      
      ArrayList<String> fruits = new ArrayList<String>();
      fruits.add("Bananna");
      fruits.add("Apple");
      fruits.add("Strawberry");
      ArrayList<String> vegitables = new ArrayList<String>();
      vegitables.add("Green Bean");
      vegitables.add("Brocolli");
      vegitables.add("Brussle Sprout");
      
      fruits.addAll(vegitables);
      
      System.out.println(fruits);
      
    }
}
