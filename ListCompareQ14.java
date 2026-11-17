import java.util.*;

class ListCompareQ14 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        LinkedList<String> l = new LinkedList<>();

        a.add("Java");
        a.add("Python");
        a.add("C++");

        l.add("Java");
        l.add("Python");
        l.add("C++");

        a.add(1, "HTML");
        l.add(1, "HTML");

        a.remove("Python");
        l.remove("Python");

        System.out.println("ArrayList: " + a);
        System.out.println("LinkedList: " + l);

        System.out.println("ArrayList get: " + a.get(1));
        System.out.println("LinkedList get: " + l.get(1));

        System.out.println("ArrayList size: " + a.size());
        System.out.println("LinkedList size: " + l.size());

        System.out.println("ArrayList iteration:");
        for (String s : a)
            System.out.println(s);

        System.out.println("LinkedList iteration:");
        for (String s : l)
            System.out.println(s);
    }
}
