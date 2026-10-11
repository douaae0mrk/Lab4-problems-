package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    public Subject() {
        this.id = 0; // Assuming id is not auto-incremented for Subject based on the prompt
        this.code = "";
        this.title = "";
        this.instructor = null;
    }

    public Subject(int id, String code, String title, Instructor instructor) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    // 2. normalizedCode
    public String normalizedCode() {
        if (code == null) return null;
        return code.trim().toUpperCase();
    }

    // 3. properTitle
    public String properTitle() {
        if (title == null || title.isEmpty()) return title;
        String[] words = title.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return sb.toString().trim();
    }

    // 5. isIntroCourse
    public boolean isIntroCourse() {
        if (title != null && title.toLowerCase().contains("intro")) return true;
        if (code != null && code.toUpperCase().startsWith("INTRO-")) return true;
        return false;
    }

    // 7. syllabusLine using StringBuilder
    public String syllabusLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(normalizedCode()).append(" - ").append(properTitle())
                .append(" (Instructor: ");

        if (instructor != null) {
            sb.append(instructor.getLastName()).append(" ").append(instructor.getFirstName());
        } else {
            sb.append("TBD");
        }

        sb.append(")");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Subject [id=" + id + ", code=" + code + ", title=" + title + "]";
    }
}