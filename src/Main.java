import java.util.Date;

public class Main {
    public class Student {
        String firstname;
        String lastname;
        long studentId;
        double weight;
        Date birthday;



        Student(String firstname, String lastname, long studentId, double weight, Date birthday) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.studentId = studentId;
            this.weight = weight;
            this.birthday = birthday;
        }

        public enum SortKey {FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}

        //Setter

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        private void setStudentId(long studentId) {
            this.studentId = studentId;
        }

        //Getter

        public String getFirstname() {
            return this.firstname;
        }

        public String getLastname() {
            return this.lastname;
        }

        public double getWeight() {
            return this.weight;
        }

        public Date getBirthday() {
            return this.birthday;
        }

        public long getStudentId() {
            return this.studentId;
        }

        public String getName() {
            return this.firstname + " " + this.lastname;
        }



    }
}
