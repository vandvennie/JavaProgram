import java.util.ArrayList;

public class ClassDatabase {

    private class StudentCourse {
        String student;
        String course;
        StudentCourse(String student, String course) {
            this.student = student;
            this.course = course;
        }
    }

    private ArrayList<StudentCourse> studentCourses;

    public ClassDatabase() {
        studentCourses = new ArrayList<StudentCourse>();
    }

    public void addCourseStudent(String student, String course) {
        studentCourses.add(new StudentCourse(student, course));
    }

    public int countStudents(String course) {
        int count = 0;
        for (StudentCourse sc : studentCourses) {
            if (sc.course.equals(course)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ClassDatabase db = new ClassDatabase();
        db.addCourseStudent("Alan Turing", "CITS2005");
        db.addCourseStudent("Alan Turing", "CITS2200");
        db.addCourseStudent("Max", "CITS9999");
        db.addCourseStudent("Gozz", "CITS9999");
        db.addCourseStudent("Jane Doe", "CITS2005");
        System.out.println(db.countStudents("CITS2005"));
        System.out.println(db.countStudents("CITS2200"));
        System.out.println(db.countStudents("CITS9999"));
    }
}