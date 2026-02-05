import java.util.Map;
import java.util.TreeMap;

public class StudentManager {

    // Add student
    public static void addStudent(Map<Integer, String> students, int studentId, String name) {

        if (students == null) {
            throw new NullPointerException("Student map is null!");
        }

        if (studentId <= 0) {
            throw new IllegalArgumentException("Student ID cannot be negative or zero!");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty!");
        }

        students.put(studentId, name);
        System.out.println("Student added: ID = " + studentId + ", Name = " + name);
    }

    // Sort students by ID
    public static Map<Integer, String> sortStudents(Map<Integer, String> students) {
        if (students == null) {
            throw new NullPointerException("Student map is null!");
        }
        return new TreeMap<>(students);
    }

    // Search student by ID
    public static void searchStudent(Map<Integer, String> students, int studentId) {
        try {
            if (students == null) {
                throw new NullPointerException();
            }

            if (students.containsKey(studentId)) {
                System.out.println("Student found: ID = " + studentId + ", Name = " + students.get(studentId));
            } else {
                System.out.println("Student with ID " + studentId + " not found.");
            }

        } catch (NullPointerException e) {
            System.out.println("Error: Student map is null!");
        }
    }

    // Remove student by ID
    public static void removeStudent(Map<Integer, String> students, int studentId) {
        try {
            if (students == null) {
                throw new NullPointerException();
            }

            if (students.remove(studentId) != null) {
                System.out.println("Student removed: ID = " + studentId);
            } else {
                System.out.println("No student found with ID " + studentId);
            }

        } catch (NullPointerException e) {
            System.out.println("Error: Student map is null!");
        }
    }

    // Find student with highest ID
    public static void findStudentWithHighestId(Map<Integer, String> students) {
        try {
            if (students == null || students.isEmpty()) {
                throw new IllegalArgumentException();
            }

            TreeMap<Integer, String> treeMap = new TreeMap<>(students);
            int maxId = treeMap.lastKey();

            System.out.println("Highest ID Student: ID = " + maxId + ", Name = " + treeMap.get(maxId));

        } catch (Exception e) {
            System.out.println("Error: Unable to find highest ID.");
        }
    }

    // Find student with lowest ID
    public static void findStudentWithLowestId(Map<Integer, String> students) {
        try {
            if (students == null || students.isEmpty()) {
                throw new IllegalArgumentException();
            }

            TreeMap<Integer, String> treeMap = new TreeMap<>(students);
            int minId = treeMap.firstKey();

            System.out.println("Lowest ID Student: ID = " + minId + ", Name = " + treeMap.get(minId));

        } catch (Exception e) {
            System.out.println("Error: Unable to find lowest ID.");
        }
    }
}
