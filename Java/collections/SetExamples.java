package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        // Set is an Interface. Resembles the properties of mathematical set. It CANNOT CONTAIN DUPLICATE ELEMENTS.
        // HashSet is commonly used if we have to access elements randomly. It is because elements in a hash table are accessed using hash codes.
        Set<Integer> set = new HashSet<>();

        set.add(67);
        set.add(23);
        set.add(30);
        set.add(12);
        set.add(23); // ignores this because its a duplicate
        System.out.println("HashSet (unordered) : "+ set); // It will print in any order ( not necessarily sorted )

        set.remove(12);
        System.out.println(set);

        System.out.println(set.contains(67));
        System.out.println(set.isEmpty());
        System.out.println(set.hashCode()); // returns the sum of hash codes of all the elements in this set.

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(4);
        evenNumbers.add(12);
        evenNumbers.add(30);
        evenNumbers.add(16);

//        set.addAll(evenNumbers); // resembles the UNION of two sets.
//        System.out.println(set);

        set.retainAll(evenNumbers); // resembles the INTERSECTION of two sets.
        System.out.println(set);

        set.clear();
        System.out.println(set);

//        LinkedHashSet maintains a linked list internally. Due to this, it maintains the insertion order of its elements.
//        The LinkedHashSet class requires more storage than HashSet. This is because LinkedHashSet maintains linked lists internally.
//        The performance of LinkedHashSet is slower than HashSet. It is because of linked lists present in LinkedHashSet.

        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(67);
        lhs.add(23);
        lhs.add(30);
        lhs.add(12);
        lhs.add(23);
        System.out.println("LinkedHashSet (in order of insertion) : "+ lhs);

//        TreeSet implements the features of a Set along with Binary Search Tree , it means the elements would be in sorted order.

        Set<Integer> ts = new TreeSet<>();
        ts.add(67);
        ts.add(23);
        ts.add(30);
        ts.add(12);
        ts.add(23);
        System.out.println("TreeSet (in sorted order) : "+ ts);
    }
}
