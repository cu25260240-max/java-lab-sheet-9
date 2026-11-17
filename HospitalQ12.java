import java.util.*;

class HospitalQ12 {
    public static void main(String[] args) {
        ArrayList<String> patients = new ArrayList<>();
        HashSet<String> ids = new HashSet<>();

        patients.add("Aman");
        patients.add("Riya");
        patients.add("Pooja");

        ids.add("P101");
        ids.add("P102");
        ids.add("P103");

        patients.remove("Riya");
        ids.remove("P102");

        System.out.println("Patients: " + patients);
        System.out.println("Patient IDs: " + ids);
        System.out.println("Search Aman: " + patients.contains("Aman"));
    }
}
