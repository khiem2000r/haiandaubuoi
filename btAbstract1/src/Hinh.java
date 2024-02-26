public abstract class Hinh {
    protected ToaDo toaDo;

    public Hinh(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    @Override
    public  String toString() {
        return "Hinh{" +
                "toaDo=" + toaDo +
                '}';
    }

    public abstract double  tinhDienTich();
}
