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
        System.out.println(cricket);
        System.out.println(football);
        cricket.removeAll(cricket);
        System.out.println(cricket);
        cricket.addAll(football);
        System.out.println(cricket);
        
        
    }
}
