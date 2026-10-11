package instructor;

public class Test {
    public static void main(String[] args) {
        // Create an Instructor
        Instructor prof = new Instructor("John", "Doe", "0601020304", "john.doe@univ.ma", "AB 123");

        // Create a Subject
        Subject sub = new Subject(1, "cs- 101", "introduction to java", prof);

        System.out.println("--- Method Testing ---");
        System.out.println("1. Clean Employee Number: " + prof.cleanEmployeeNumber());
        System.out.println("2. Normalized Code: " + sub.normalizedCode());
        System.out.println("3. Proper Title: " + sub.properTitle());
        System.out.println("4. Summary Line: " + prof.summaryLine());
        System.out.println("5. Is Intro Course: " + sub.isIntroCourse());

        System.out.println("\n--- To Card ---");
        System.out.println(prof.toCard());

        System.out.println("\n--- Syllabus Line ---");
        System.out.println(sub.syllabusLine());

        System.out.println("\n--- Display Name ---");
        System.out.println("Full name: " + prof.displayName());

        Instructor nullFirstNameProf = new Instructor(null, "Smith", "123", "smith@test.com", "EMP001");
        System.out.println("Null first name: " + nullFirstNameProf.displayName());
    }
}