public class StudentManagement {
    private Student[] students = new Student[100];
    private String[] groups = new String[100];
    private int ssize = 0;
    private int gsize = 0;

    /**
     * Compare Group.
     * @param s1 First variable.
     * @param s2 Second variable.
     * @return sameGroup
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * addStudent.
     * @param newStudent Parameter.
     */
    public void addStudent(Student newStudent) {
        students[ssize] = newStudent;
        ssize += 1;
    }

    /**
     * studentsByGroup.
     * @return students By Group
     */
    public String studentsByGroup() {
        String result = "";

        for (int i = 0; i < ssize; i++) {
            Student s = students[i];
            boolean check = false;
            for (int j = 0; j < gsize; j++) {
                if (s.getGroup().equals(groups[j])) {
                    check = true;
                    break;
                }
            }
            if (check == false) {
                groups[gsize] = s.getGroup();
                gsize += 1;
            }
        }

        for (int i = 0; i < gsize; i++) {
            result = result.concat(groups[i]).concat("\n");
            for (int j = 0; j < ssize; j++) {
                Student s = students[j];
                if (s.getGroup().equals(groups[i])) {
                    result = result.concat(s.getInfo()).concat("\n");
                }
            }
        }
        return result;
    }

    /**
     * remove Student.
     * @param id id of student.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < ssize; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < ssize - 1; j++) {
                    students[j] = students[j + 1];
                }
                ssize -= 1;
                break;
            }
        }
    }   

    /**
     * main method.
     * @param args Parameter.
     */
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        Student s2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        Student s3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        Student s4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        s1.setGroup("K62CC");
        s2.setGroup("K62CC");
        StudentManagement SM = new StudentManagement();
        SM.addStudent(s1);
        SM.addStudent(s2);
        SM.addStudent(s3);
        SM.addStudent(s4);
        System.out.println(SM.studentsByGroup());
        SM.removeStudent("17020002");
        System.out.println(SM.studentsByGroup()); 
    }
}