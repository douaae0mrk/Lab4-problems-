package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;
    public Person(){
        this.id = nextId++;
        this.firstName = "";
        this.lastName= "";
        this.phone= "";
        this.email= "" ;
    }
    public Person(String firstName, String lastName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.lastName= lastName;
        this.phone= telephone;
        this.email= email ;
    }
    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = Person.this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName +
                ", phone=" + phone + ", email=" + email ;
    }

}

