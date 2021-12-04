import java.util.Vector;

public class Department {
    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.

    Random rand = new Random();

    public Department(String name, String id) {

        name = this.name;
        id = this.id;

        Vector<Course> courselist = new Vector<Course>();
        Vector<Student> registerlist = new Vector<Student>();

    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public String toString() {
        System.out.println(name+ ": " + courseList.size() + " courses, " + registerList.size() + " students");
        return null;
    }

    public void offerCourse(Course course){
        courseList.add(course);
    }

        public void printCoursesOffered(){

        for (int i = 0; i < courseList.size(); i++){

            //print the course info of the ith element of courseList
            courseList.elementAt(i).toString();

        }

    }

    public void addStudentToRegister(Student stud){

        if (isStudentRegistered(stud)) {

            registerList.add(stud);

        }

    }


    public boolean isStudentRegistered(Student student){

        return (registerList.contains(student));

    }


    public Vector<Student> studentsRegisteredInCourse(int code){

        boolean found = false;
        Vector<Student> studentsInCourse = new Vector<Student>();

        for (int i = 0; i < courseList.size(); i ++){

            if (code==((courseList.elementAt(i)).getCode())){

                studentsInCourse = (courseList.elementAt(i)).getClassList();
                found =true;
                break;
            }
        }


        if (found){
            return studentsInCourse;
        } else {
            System.out.println("This course is not taught in this department.");
            return null;
        }
    }


    public void printStudentsRegisteredInCourse(int code){

        //print a header
        System.out.println("These are the students enrolled in " + id + code + ": ");

        int hold, size;

        Vector<Student> courseStudents = studentsRegisteredInCourse(code);
        size = courseStudents.size();
        Vector<Student> copy = new Vector<Student>(size);


        for (int i = 0; i < size; i++){

            do {
                hold = rand.nextInt(size);

            } while (!(copy.contains(courseStudents.elementAt(hold))));

            copy.add(courseStudents.elementAt(hold));
            (courseStudents.elementAt(hold)).toString();
        }
    }
}
