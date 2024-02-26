public class SinhVien {
    private String roll;
    private String name;
    private int year;
    private float diem;

    public SinhVien() {
    }

    public SinhVien(String roll, String name, int year, float diem) {
        this.roll = roll;
        this.name = name;
        this.year = year;
        this.diem = diem;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        if(diem >= 0 ){
        this.diem = diem;
        }
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "roll='" + roll + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", diem=" + diem +
                '}';
    }
}
