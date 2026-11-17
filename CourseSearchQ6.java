import java.util.*;

class CourseSearchQ6 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("BCA");
        courses.add("BBA");
        courses.add("B.Tech");
        courses.add("MCA");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course: ");
        String name = sc.nextLine();

        if (courses.contains(name))
            System.out.println("Course Found");
        else
            System.out.println("Course Not Found");
    }
}
