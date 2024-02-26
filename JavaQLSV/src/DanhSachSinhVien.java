import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien>danhsach;

    public DanhSachSinhVien() {
        this.danhsach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }
    public  void themSV(SinhVien sinhVien){
        this.danhsach.add(sinhVien);
    }
    public void inDSSV(){
        for (SinhVien sinhVien : danhsach){
            System.out.println(sinhVien);
        }
    }
    public boolean ktramang(){
        if (danhsach.isEmpty()){
            return true;
        }else {
            System.out.println("Danh Sach khong rong ");
            return false;
        }
    }
    public int soLuongDanhSanhSV(){
       int size = danhsach.size();
        return size;
    }
    public boolean ktsv(String roll){
        for (SinhVien sinhVien : danhsach){
           if (sinhVien.getRoll().equals(roll)){
               return true;
           }
        }
        return false;
    }
    public void cleardssv(){
        danhsach.clear();
    }
    public boolean xoaSv(String roll){
        for (SinhVien sinhVien : danhsach){
            if (sinhVien.getRoll().equals(roll)){
                danhsach.remove(sinhVien);
                return true;
            }
        }
        return false;
    }
    public void   TenSv(String tensv){
        for (SinhVien sinhVien : danhsach){
            if (sinhVien.getName().indexOf(tensv) >= 0){
                System.out.println(sinhVien);
            }
        }
    }
    public  void sapXepSVGiamDanTheoDiem(){
       Collections.sort(this.danhsach, new Comparator<SinhVien>() {
           @Override
           public int compare(SinhVien sinhvien1   , SinhVien sinhvien2) {
               if(sinhvien1.getDiem() <sinhvien2.getDiem()){
                   return 1;
               }else if (sinhvien1.getDiem() >sinhvien2.getDiem()){
                   return -1;
               }else {
                   return 0;
               }
           }
       });
    }



}
