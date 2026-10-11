package student;

public class Test {
    public static void main(String[] args) {
        // 4.a Create a couple of majors
        Major csMajor = new Major("23", "Computer Science");
        Major mathMajor = new Major("10", "Mathematics");

        // 4.b Create some students associated with these majors
        Student s1 = new Student("Amal", "SAFI", "0600000000", "amal@email.com", "22885676", csMajor);
        Student s2 = new Student("Samir", "ALAMI", "0611111111", "samir@email.com", "23585976", csMajor);
        Student s3 = new Student("John", "Doe", "0622222222", "john@email.com", "11223344", mathMajor);

        // Test the default constructor (Requirement 1)
        Student s4 = new Student("Default", "Student", "0633333333", "default@email.com", "99887766");

        // 4.c Display computer science students
        System.out.println("The list of students in the computer science major is:");
        csMajor.displayStudents();

        // 11. Call the newly created methods
        System.out.println("\n--- Testing newly created methods ---");

        // Requirement 5: getFullNameFormatted
        System.out.println("Formatted Name (Student 1): " + s1.getFullNameFormatted());

        // Requirement 6: findStudentByCNE
        System.out.println("Finding student with CNE 23585976: " + csMajor.findStudentByCNE("23585976"));

        // Requirement 7: getStudentCount
        System.out.println("Current enrollment in CS: " + csMajor.getStudentCount());

        // Requirement 9: getOccupancyRate
        System.out.println("CS Occupancy Rate: " + String.format("%.1f", csMajor.getOccupancyRate()) + "%");

        // Requirement 8: removeStudent
        System.out.println("Removing student with CNE 22885676...");
        boolean removed = csMajor.removeStudent("22885676");
        System.out.println("Was student removed? " + removed);
        System.out.println("New enrollment count: " + csMajor.getStudentCount());

        // Requirement 10: getStudentListAsString
        System.out.println("\nRemaining students in CS list:");
        System.out.println(csMajor.getStudentListAsString());
    }
}