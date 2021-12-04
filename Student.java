import java.util.Vector;

public class Student {
    private String id;
    private String name;
    private Vector courses; // contains all courses the student is registered in


    public Student(String stdId, String studentName) {

        super(studentName);

        id = stdId;

        Vector<Course> courses = new Vector<Course>();
    }

    public String getName() {

        return name;

    }

    public String getId() {

        return id;

    }

    public String toString() {

        System.out.println(id + " " + name);
        System.out.println("Registered courses: " + courses);

        return null;

    }


    public Boolean isRegisteredInCourse(Course course){

        return courses.contains(course);

    }

    public void registerFor(Course course){

        //checks if the student is already in the course or not
        if (!(courses.contains(course))){

            courses.add(course);
            course.addToClassList();
            course.addStudentToCourse();

        }
    }
}
