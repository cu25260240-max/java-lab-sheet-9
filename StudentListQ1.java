import java.util.*;

class StudentListQ1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Riya");
        names.add("Pooja");
        names.add("Rahul");
        names.add("Neha");
        names.add("Anjali");
        names.add("Karan");
        names.add("Priya");
        names.add("Rohan");
        names.add("Simran");

        for (String n : names)
            System.out.println(n);

        System.out.println("Total Students: " + names.size());
    }
}