package student;

public class Student extends Person {
    private String cne;
    private Major major;
    public Student(){
        super();
        this.cne = "";
        this.major = null;
    }

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = major;
        major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        Major csMajor = new Major("23" , "computer science ");
        this.major = csMajor;
        csMajor.addStudent(this);
    }

    // Getters
    public String getCne() {
        return cne;
    }

    public Major getMajor() {
        return major;
    }

    // Setters
    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String toString() {
        return "Student [" + super.toString() + ", cne=" + cne + ", major=" + (major != null ? major.getName() : "None") + "]";
    }
    public String getFullNameFormatted(){

        return this.lastName.toUpperCase()+", "+ this.firstName;

    }
}

