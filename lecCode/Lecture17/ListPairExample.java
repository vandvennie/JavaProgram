import java.util.ArrayList;

public class ListPairExample {
    public static void main(String[] args) {
        var studentList = new ArrayList<GenericPair<Integer, String>>();
        studentList.add(new GenericPair<Integer, String>(10243549, "Alan Turing"));
        studentList.add(new GenericPair<Integer, String>(10243550, "Ada Lovelace"));
        studentList.add(new GenericPair<Integer, String>(20873551, "Don Knuth"));
        for (GenericPair<Integer, String> student : studentList)
            System.out.println(student.first + ": " + student.second);
    }
}