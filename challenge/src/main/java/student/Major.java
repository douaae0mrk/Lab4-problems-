package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students =new Student[50];
    private int studentCount;

    public Major() {
        this.id = nextId++;
        this.code = "";
        this.name = "";
        this.studentCount = 0;
    }

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount<50){
            students[studentCount]=s ;
            studentCount++;
        }
    }

    // Getters+Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    // Display all students in the major
    public void displayStudents() {
        for(Student s : students){
            if(s!=null){
                System.out.println(s);
            }
        }
    }

    public String toString() {
        return "Major [id=" + id + ", code=" + code + ", name=" + name + ", studentCount=" + studentCount + "]";
    }

    public Student findStudentByCNE(String cne ){
        for(int i = 0 ; i<studentCount; i++){
            if(students[i].getCne().equals(cne) && students[i]!=null){
                return students[i] ;
            }
        }
        return null ;
    }
    public boolean removeStudent(String cne ){
        Student s = findStudentByCNE(cne);
        if(s!=null){
            for(int i =0; i<studentCount; i++){
                if(students[i]==s){
                    students[i]=null ;
                    studentCount--;
                    return true ;
                }
            }
        }
        return false ;
    }
    public double getOccupancyRate(){
        return (studentCount*1.0/50)*100 ;
    }
    public String getStudentListAsString(){
        StringBuilder sb =new StringBuilder();
        for(Student s : students){
            if(s!=null){
                sb.append(s);
                sb.append('\n');
            }
        }
        return sb.toString();
    }


}