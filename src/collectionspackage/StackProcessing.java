
package collectionspackage;

import java.util.Set;
import java.util.TreeSet;


public class StackProcessing {
    public static void main(String[] args) {
        Set<String> cricket=new TreeSet<>();
        Set<String> football=new TreeSet<>();
        cricket.add("A");
        cricket.add("C");
        football.add("B");
        football.add("C");
        Set<String> cricketdifference= new TreeSet<>();
        cricketdifference.addAll(cricket);
        cricketdifference.removeAll(football);
        System.out.println(cricketdifference);
        Set<String> footballdifference= new TreeSet<>();
        footballdifference.addAll(football);
        footballdifference.removeAll(cricket);
        System.out.println(footballdifference);
        Set<String> symmetricdifference= new TreeSet<>();
        symmetricdifference.addAll(cricketdifference);
        symmetricdifference.addAll(footballdifference);
        System.out.println(symmetricdifference);
        Set<String> union=new TreeSet<>();
        union.addAll(cricket);
        union.addAll(football);
        System.out.println(union);
        Set<String> intersection=new TreeSet<>();
        intersection.addAll(union);
        intersection.removeAll(symmetricdifference);
        System.out.println(intersection);
        
        
    }
 
}
