import java.util.*;

class UtilityQ7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(50);

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reverse: " + list);

        System.out.println("Maximum: " + Collections.max(list));
        System.out.println("Minimum: " + Collections.min(list));
        System.out.println("Frequency: " + Collections.frequency(list, 20));
    }
}
