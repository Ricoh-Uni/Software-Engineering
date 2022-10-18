import java.util.Date;

public class Main {
    public class Student {
        String firstname;
        String lastname;
        long studentId;
        double weight;
        Date birthday;

        String frommike1;


        Student(String firstname, String lastname, long studentId, double weight, Date birthday) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.studentId = studentId;
            this.weight = weight;
            this.birthday = birthday;
        }

        public enum SortKey {FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}
    }
}
