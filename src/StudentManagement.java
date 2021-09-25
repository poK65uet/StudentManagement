public class StudentManagement {
    private Student[] students = new Student[150];
    private static int count = 0;

    /**
     * Compare Group.
     * @param s1 First variable.
     * @param s2 Second variable.
     * @return sameGroup
     */
    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup() == s2.getGroup()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * addStudent.
     * @param newStudent Parameter.
     */
    public void addStudent(Student newStudent) {
        students[count] = newStudent;
        count += 1;
    }

    /**
     * studentsByGroup.
     * @return students By Group
     */
    public String studentsByGroup() {
        String result = "";
        boolean[] res = new boolean[150];
        for (int i = 0; i < count; i++) {
            Student s = students[i];
            if (res[i] == false) {
                result = result.concat(s.getGroup()).concat("\n");
                for (int j = i; j < count; j++) {
                    Student t = students[j];
                    if (t.getGroup().equals(s.getGroup())) {
                        res[j] = true;
                        result = result.concat(t.getInfo()).concat("\n");
                    }
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
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                count -= 1;
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
