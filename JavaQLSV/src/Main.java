import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luachon =0;
        do {
            System.out.println("Menu---------");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1. Thêm sinh viên vào danh sách. \n"+"" +
                    "2. In danh sách sinh viên ra màn hình. \n"+
                    "3. Kiểm tra danh sách có rỗng hay không. \n"+
                    "4. Lấy ra số lượng sinh viên trong danh sách. \n"+
                    "5. Làm rỗng danh sách sinh viên. \n"+
                    "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên. \n"+
                    "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên. \n"+
                    "8. Tìm kiếm tất cả sinh viên dựa trên Tên đươc nhập từ bàn phím. \n"+
                    "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp. \n"+
                    "0. Exit.");
            luachon = sc.nextInt();
            sc.nextLine();
            if (luachon ==1 ){
                System.out.println("Nhập mã sinh viên: "); String maSinhvien = sc.nextLine();
                System.out.println("Nhập họ và tên: "); String name = sc.nextLine();
                System.out.println("Nhập năm sinh: "); int year = sc.nextInt();
                System.out.println("Nhập điểm trung bình: "); float diem = sc.nextFloat();
                SinhVien sv = new SinhVien(maSinhvien,name,year,diem);
                dssv.themSV(sv);
            }else if (luachon ==2 ){
                dssv.inDSSV();

            }else if (luachon ==3 ){
                if (dssv.ktramang() == true){
                    System.out.println("Danh sách sinh viên đang rỗng");
                }else {
                    System.out.println("Danh sách sinh viên không rỗng");
                }
            }else if (luachon ==4 ){
                System.out.println("Số lượng sinh viên trong danh sách là: "+ dssv.soLuongDanhSanhSV());
            }else if (luachon ==5 ){
                dssv.cleardssv();
            }else if (luachon == 6 ){
                System.out.println("Mời bạn nhập mã sinh viên muốn tìm: ");
                String masv = sc.nextLine();
                if (dssv.ktsv(masv) == true){
                    System.out.println("Sinh viên bạn tìm có tồn tại trong mảng.");
                }else {
                    System.out.println("Sinh viên bạn tìm có không tồn tại trong mảng.");
                }

            }else if (luachon ==7 ){
                System.out.println("Mời bạn nhập mã sinh viên muốn xóa: ");
                String xoasv = sc.nextLine();
                if (dssv.xoaSv(xoasv) == true){
                    System.out.println("Sinh viên đã được xóa.");
                }else {
                    System.out.println("Sinh viên không tồn tại");
                }
            }else if (luachon ==8 ){
                System.out.println("Mời nhập tên muốn tìm trong danh sách: ");
                String tentimkiem = sc.nextLine();
                dssv.TenSv(tentimkiem);
            }else if (luachon ==9 ){
                dssv.sapXepSVGiamDanTheoDiem();
                dssv.inDSSV();
            }


        }while (luachon != 0);
        }
    }
