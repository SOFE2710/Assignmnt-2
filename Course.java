import java.util.Vector;

public class Course {
    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private  Vector <Student>classList; // contains all students registered in this course

    public Course(String code, int number, Department dept, String title) {
        dept = this.dept;
        title = this.title ;
        code = this.code;
        number = this.number;
        classList = new Vector<Student>();
    }


    public Course() {
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        System.out.println(code + " " + number + " " + title + ", Enrollment = " + classList.size());
        return " ";
    }

    public int getNumber() {
        return number;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public void addStudentToCourse(Student student) {
        classList.add(student);
    }

    public String getClassList() {
        return classList.size();
    }

    public boolean equals (Course course) {
        if (code == (course.getCode()) && number == course.getNumber()) {
            return true;
        }
        return false;
    }

}

