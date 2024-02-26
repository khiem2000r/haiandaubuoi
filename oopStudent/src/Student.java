public class Student {
    private String nameCar;
    private String engine;
    public static  int numberOfCars;
    public Student(String nameCar,String engine){
        this.nameCar = nameCar;
        this.engine = engine;
        numberOfCars++;
    }
















    private int rollno;
    private String name;
    private static String colleege = "BBDIT";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void  change(){
        colleege = "CODEGYM";
    }
    void display(){
        System.out.println(rollno+" "+ name + " "+ colleege);
    }

}
