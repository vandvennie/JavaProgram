import java.util.ArrayList;

public class ClassDatabase {
  class StudentCourse {
    private String student;
    private String course;
    StudentCourse (String student, String course){
      this.student = student; 
      this.course = course;
    }
    public String getStudent() {
      return student;
    }

    public String getCourse() {
        return course;
    }
  }
    private ArrayList<StudentCourse> db;
    public ClassDatabase() {
      db = new ArrayList<>();
    }

    public void addCourseStudent(String student, String course) {
      StudentCourse sc = new StudentCourse(student,course);
      db.add(sc);
    }

    public int countStudents(String course) {
      int count =0;
      for(int i=0; i<db.size(); i ++){
        if ( db.get(i).getCourse().equals(course))
          count++;
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