package Test;

import java.util.Scanner;

import Main.DanhSachSinhVien;
import Main.SinhVien;

public class test {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	DanhSachSinhVien dssv = new DanhSachSinhVien();
	int luachon = 0;
	do {
		System.out.println("MENU-----");
		System.out.println("Vui long lua chon chuc nang");
		System.out.println(
				"1. Thêm sinh viên vào danh sách.\r\n"
				+ "2. In danh sach sinh vien da duoc them vao"
				+ "3. Kiểm tra danh sách có rỗng hay không.\r\n"
				+ "4. Lấy ra số lượng sinh viên trong danh sách\r\n"
				+ "5. Làm rỗng danh sách sinh viên\r\n"
				+ "6. Xoá một sinh viên ra khỏi danh sách dựa trên mã sinh viên \r\n"
				+ "7. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên\r\n"
				+ "8. Tìm kiếm một sinh viên dựa trên Tên.\r\n"
				+ "9. Xuất ra danh sách sinh viên cớ điểm từ cao đến thấp\r\n "
				+ "0. Thoát khỏi chương trình"
				);
		luachon = scan.nextInt();
		scan.nextLine();
		
		if (luachon == 1 ) {
			System.out.println("Nhập mã sinh viên"); String maSinhVien = scan.nextLine();
			System.out.println("Nhập Họ và tên"); String hoVaTen = scan.nextLine();
			System.out.println("Nhập năm sinh"); int namSinh = scan.nextInt();
			System.out.println("Nhập điẻm trung bình"); float diemTrungBinh = scan.nextFloat();
			SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
			dssv.themSinhVien(sv);
		}else if (luachon == 2 ) {
			//In danh sach sinh vien ra
			dssv.inDanhSachSinhVien();
		}else if (luachon == 3 ) {
			System.out.println("Danh sach sinh vien " + dssv.kiemTraDanhSachRong());
		}else if (luachon == 4 ) {
			System.out.println("So luong sinh vien " + dssv.laySoLuongSinhVien());
		}else if (luachon == 5 ) {
			dssv.lamRongDanhSach();
		}else if (luachon == 6 ) {
			System.out.println("Nhập mã sinh viên"); String maSinhVien = scan.nextLine();
			SinhVien sv = new SinhVien(maSinhVien);
			System.out.println("Kiem tra sinh vien co trong danh sach " + dssv.kiemTraTonTai(sv));
		}else if (luachon == 7 ) {
			System.out.println("Nhập mã sinh viên"); String maSinhVien = scan.nextLine();
			SinhVien sv = new SinhVien(maSinhVien);
			System.out.println("Xoa sinh vien " + dssv.xoaSinhVien(sv));
		}else if (luachon == 8 ) {
			System.out.println("Nhập tên sinh viên"); String hoVaTen = scan.nextLine();
			System.out.println("Ket qua tim kiem: ");
			dssv.timSinhVien(hoVaTen);
			
		}else if (luachon == 9) {
			dssv.sapXepSinhVienGiamDanTheoDiem();
			dssv.inDanhSachSinhVien();
		}
		
		
		
	}while(luachon != 0);
}
}
