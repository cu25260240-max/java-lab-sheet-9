import java.util.*;

class StudentQueueQ8 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Aman");
        list.addLast("Riya");
        list.addLast("Pooja");
        list.addLast("Rahul");

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}
