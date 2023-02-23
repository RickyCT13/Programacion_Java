package ActsUD5.EjemplosCollectionS;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();
        Collection<Integer> hs = new HashSet<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        Collections.shuffle(al);
        Collections.shuffle(ll);
        List<Integer> hs1 = new ArrayList<>(hs.stream().toList());
        Collections.shuffle(hs1);
        hs = new ArrayList<>(hs1);
        System.out.println(al);
        System.out.println(ll);
        System.out.println(hs1);




        Collections.sort(al);
        Collections.sort(ll);


    }
}
