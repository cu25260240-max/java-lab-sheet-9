import java.util.*;

class UpdateStudentQ3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Riya");
        names.add("Pooja");
        names.add("Rahul");
        names.add("Neha");

        names.set(1, "Anjali");
        names.remove(3);

        System.out.println(names);
    }
}
