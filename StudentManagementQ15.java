import java.util.*;

class StudentQ15 {
    int id;
    String name;
    double marks;

    StudentQ15(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

class StudentManagementQ15 {
    public static void main(String[] args) {
        ArrayList<StudentQ15> list = new ArrayList<>();
        HashSet<Integer> ids = new HashSet<>();
        TreeSet<Integer> sortedIds = new TreeSet<>();

        list.add(new StudentQ15(101, "Aman", 85));
        list.add(new StudentQ15(102, "Riya", 90));
        list.add(new StudentQ15(103, "Pooja", 88));
        list.add(new StudentQ15(104, "Rahul", 78));
        list.add(new StudentQ15(105, "Neha", 92));

        for (StudentQ15 s : list) {
            ids.add(s.id);
            sortedIds.add(s.id);
            s.display();
        }

        System.out.println("Total: " + list.size());
        System.out.println("Unique IDs: " + ids);
        System.out.println("Sorted IDs: " + sortedIds);

        int search = 103;
        for (StudentQ15 s : list) {
            if (s.id == search)
                System.out.println("Found: " + s.name);
        }

        list.remove(0);
        System.out.println("After Remove: " + list.size());

        ListIterator<StudentQ15> it = list.listIterator();

        System.out.println("Forward:");
        while (it.hasNext())
            it.next().display();

        System.out.println("Backward:");
        while (it.hasPrevious())
            it.previous().display();

        System.out.println("ID 103 exists: " + ids.contains(103));
    }
}
