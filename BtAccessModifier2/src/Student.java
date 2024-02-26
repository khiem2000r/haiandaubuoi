public class Student {
    private String name ;
    private String classes;
    public Student(){}
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    private void setClasses(String classes) {
        this.classes = classes;
    }
    public void setStudentInfọ(String name, String classes){
        this.name = name;
        this.classes = classes;
    }
    public void printStudentInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Classes: " + getClasses());
    }
}
