/*

Java Collections
There are three generic types of collections namely ordered lists, dictionaries/maps, and sets.

Ordered lists allows the programmer to insert items in a certain order and retrieve those items in the same order. An example is a waiting list. The base interfaces for ordered lists are called List and Queue.

Dictionaries/Maps store references to objects with a lookup key to access the object's values. One example of a key is an identity card. The base interface for dictionaries/maps is called Map.

Sets are unordered collections that can be iterated and contain each element at most once. The base interface for sets is called Set

This is a simple example.


List interface
Lists are implemented in the collections framework via the java.util.List interface. It defines a list as essentially a more flexible version of an array. Elements have a specific order, and duplicate elements are allowed. Elements can be placed in a specific position. They can also be searched for within the list. Two examples for concrete classes that implement List are:

java.util.ArrayList, which implements the list as an array. Whenever functions specific to a list are required, the class moves the elements around within the array in order to do it.
java.util.LinkedList. This class stores the elements in nodes that each have a pointer to the previous and next nodes in the list. The list can be traversed by following the pointers, and elements can be added or removed simply by changing the pointers around to place the node in its proper place


Stack class
Stacks are created using java.util.Stack. The stack offers methods to put a new object on the stack (method push()) and to get objects from the stack (method pop()). A stack returns the object according to last-in-first-out (LIFO), e.g. the object which was placed latest on the stack is returned first. java.util.Stack is a standard implementation of a stack provided by Java. The Stack class represents a last-in-first-out (LIFO) stack of objects. It extends class java.util.Vector with five operations that allow a vector to be treated as a stack. The usual push and pop operations are provided, as well as a method to peek at the top item on the stack, a method to test for whether the stack is empty, and a method to search the stack for an item and discover how far it is from the top. When a stack is first created, it contains no items.

Queue interfaces
The java.util.Queue interface defines the queue data structure, which stores elements in the order in which they are inserted. New additions go to the end of the line, and elements are removed from the front. It creates a first-in first-out system. This interface is implemented by java.util.LinkedList, java.util.ArrayDeque, and java.util.PriorityQueue. LinkedList, of course, also implements the List interface and can also be used as one. But it also has the Queue methods. ArrayDeque implements the queue as an array. Both LinkedList and ArrayDeque also implement the java.util.Deque interface, giving it more flexibility.

java.util.Queue can be used more flexibly with its subinterface, java.util.concurrent.BlockingQueue. The BlockingQueue interface works like a regular queue, but additions to and removals from the queue are blocking. If remove is called on an empty queue, it can be set to wait either a specified time or indefinitely for an item to appear in the queue. Similarly, adding an item is subject to an optional capacity restriction on the queue, and the method can wait for space to become available in the queue before returning.

java.util.PriorityQueue implements java.util.Queue, but also alters it. Instead of elements being ordered in the order in which they are inserted, they are ordered by priority. The method used to determine priority is either the compareTo() method in the elements or a method given in the constructor. The class creates this by using a heap to keep the items sorted.[14]

Double-ended queue (deque) interfaces
The java.util.Queue interface is expanded by the java.util.Deque subinterface. Deque creates a double-ended queue. While a regular queue only allows insertions at the rear and removals at the front, the deque allows insertions or removals to take place both at the front and the back. A deque is like a queue that can be used forwards or backwards, or both at once. Additionally, both a forwards and a backwards iterator can be generated. The Deque interface is implemented by java.util.ArrayDeque and java.util.LinkedList.

The java.util.concurrent.BlockingDeque interface works similarly to java.util.concurrent.BlockingQueue. The same methods for insertion and removal with time limits for waiting for the insertion or removal to become possible are provided. However, the interface also provides the flexibility of a deque. Insertions and removals can take place at both ends. The blocking function is combined with the deque function.

Set interfaces
Java's java.util.Set interface defines the set. A set can't have any duplicate elements in it. Additionally, the set has no set order. As such, elements can't be found by index. Set is implemented by java.util.HashSet, java.util.LinkedHashSet, and java.util.TreeSet. HashSet uses a hash table. More specifically, it uses a java.util.HashMap to store the hashes and elements and to prevent duplicates. java.util.LinkedHashSet extends this by creating a doubly linked list that links all of the elements by their insertion order. This ensures that the iteration order over the set is predictable. java.util.TreeSet uses a red–black tree implemented by a java.util.TreeMap. The red–black tree makes sure that there are no duplicates. Additionally, it allows TreeSet to implement java.util.SortedSet.

The java.util.Set interface is extended by the java.util.SortedSet interface. Unlike a regular set, the elements in a sorted set are sorted, either by the element's compareTo() method, or a method provided to the constructor of the sorted set. The first and last elements of the sorted set can be retrieved, and subsets can be created via minimum and maximum values, as well as beginning or ending at the beginning or ending of the sorted set. The SortedSet interface is implemented by java.util.TreeSet.

java.util.SortedSet is extended further via the java.util.NavigableSet interface. It's similar to SortedSet, but there are a few additional methods. The floor(), ceiling(), lower(), and higher() methods find an element in the set that's close to the parameter. Additionally, a descending iterator over the items in the set is provided. As with SortedSet, java.util.TreeSet implements NavigableSet.[19]

Map interfaces
Maps are defined by the java.util.Map interface in Java. Maps are simple data structures that associate a key with an element. This lets the map be very flexible. If the key is the hash code of the element, the map is essentially a set. If it's just an increasing number, it becomes a list. Maps are implemented by java.util.HashMap, java.util.LinkedHashMap, and java.util.TreeMap. HashMap uses a hash table. The hashes of the keys are used to find the elements in various buckets. LinkedHashMap extends this by creating a doubly linked list between the elements, allowing them to be accessed in the order in which they were inserted into the map. TreeMap, in contrast to HashMap and LinkedHashMap, uses a red–black tree. The keys are used as the values for the nodes in the tree, and the nodes point to the elements in the map.

The java.util.Map interface is extended by its subinterface, java.util.SortedMap. This interface defines a map that's sorted by the keys provided. Using, once again, the compareTo() method or a method provided in the constructor to the sorted map, the key-element pairs are sorted by the keys. The first and last keys in the map can be called. Additionally, submaps can be created from minimum and maximum keys. SortedMap is implemented by java.util.TreeMap.

sThe java.util.NavigableMap interface extends java.util.SortedMap in various ways. Methods can be called that find the key or map entry that's closest to the given key in either direction. The map can also be reversed, and an iterator in reverse order can be generated from it. It's implemented by java.util.TreeMap.
*/
package understandingcollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StartingCollections {
    public static void main(String[] args) {
        List<Integer>  li=new  ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        for(int x:li)
            System.out.print(x + ",");
        System.out.println();
        ArrayList<Integer> al=(ArrayList<Integer>)li;
        
        
        li=new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        
        for(int x:li)
            System.out.print(x + ",");
        System.out.println();
        LinkedList<Integer> ll=(LinkedList<Integer>)li;
       
    }
}
