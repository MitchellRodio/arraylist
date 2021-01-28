import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
 
public class Duplicates.java 
{
    public static void main(String[] args) 
    {
      // ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        ArrayList<String> animals = new ArrayList<>(Arrays<String>("Dog", "Cat", "Tiger", "Dog", "Armadillo"));
         
        System.out.println(animals);
 
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(animals);
         
        ArrayList<String> listWithoutDuplicates = new ArrayList<>(hashSet);
         
        System.out.println(listWithoutDuplicates);
    }
}
