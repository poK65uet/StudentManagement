public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Constructor.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor Student.
     * @param name Your name.
     * @param id Your id.
     * @param email Your email.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Constructor Student.
     * @param s Parameter.
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * setName.
     * @param name Your name.
     */
    public void setName(String name) { 
        this.name = name;
    }

    /**
     * setId.
     * @param id Your id.
     */
    public void setId(String id) { 
        this.id = id;
    }
    
    /**
     * setGroup.
     * @param group Your group.
     */
    public void setGroup(String group) { 
        this.group = group;
    }

    /**
     * setEmail.
     * @param email Your email.
     */
    public void setEmail(String email) { 
        this.email = email;
    }

    /**
     * getName.
     * @return Name
     */
    public String getName() { 
        return this.name; 
    }

    /**
     * getId.
     * @return Id
     */
    public String getId() { 
        return this.id; 
    }

    /**
     * getGroup.
     * @return Group
     */
    public String getGroup() { 
        return this.group; 
    }

    /**
     * getEmail.
     * @return Email
     */
    public String getEmail() { 
        return this.email; 
    }

    /**
     * getInfo.
     * @return Information
     */
    public String getInfo() { 
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}
