import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        StudentManager.addStudent(students, 1, "Alice");
        StudentManager.addStudent(students, 2, "Raissa");

        try {
            StudentManager.addStudent(students, -1, "Test");
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            StudentManager.addStudent(students, 4, null);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        StudentManager.searchStudent(students, 1);
        StudentManager.searchStudent(students, 10);
        StudentManager.removeStudent(students, 3);

        Map<Integer, String> sortedStudents = StudentManager.sortStudents(students);
        System.out.println("Sorted Students: " + sortedStudents);

        TreeMap<Integer, String> treeMapStudents = new TreeMap<>(students);
        StudentManager.findStudentWithHighestId(treeMapStudents);
        StudentManager.findStudentWithLowestId(treeMapStudents);
    }
}
