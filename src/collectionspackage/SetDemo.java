package collectionspackage;

import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> cricket=new TreeSet<>();
        Set<String> football=new TreeSet<>();
        cricket.add("A");
        cricket.add("C");
        football.add("B");
        football.add("C");
        System.out.println("Cricket " + cricket);
        System.out.println("Football " + football);
        Set<String> union=new TreeSet<>();
        union.addAll(cricket);
        union.addAll(football);
        System.out.println("Union " + union);
        Set<String> intersection=new TreeSet<>(cricket);
        intersection.retainAll(football);
        System.out.println("Intersection " + intersection);
        Set<String> difference=new TreeSet<>(cricket);
        difference.removeAll(football);
        System.out.println("Difference " + difference);
        
        
    }
}
