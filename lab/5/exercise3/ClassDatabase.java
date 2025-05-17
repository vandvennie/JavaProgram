import java.util.ArrayList;
class StudentCourse{
  private String student;
  private String course;
  public StudentCourse(String student, String course) {
    this.student=student;
    this.course=course;
  }
  public String getStudent() {
    return student;
  }
  public void setStudent(String student) {
    this.student = student;
  }
  public String getCourse() {
    return course;
  }
  public void setCourse(String course) {
    this.course = course;
  }
}
 
public class ClassDatabase {
  private String student;
  private String course;
  ArrayList<StudentCourse> sclist = new ArrayList<>();
  public ClassDatabase() {
 
  }

  public void addCourseStudent(String student, String course) {
    sclist.add(new StudentCourse(student, course));
  }

  public int countStudents(String course) {
    int sum = 0;
    for (int i=0; i<sclist.size();i++){
      if (sclist.get(i).getCourse().equals(course)){
        sum++;
      }
    }
    return sum;
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

    public String getStudent() {
      return student;
    }

    public String getCourse() {
      return course;
    }

    public void setStudent(String student) {
      this.student = student;
    }

    public void setCourse(String course) {
      this.course = course;
    }
}