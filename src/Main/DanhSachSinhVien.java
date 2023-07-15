package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;
	
	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	//Them sinh vien
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}
	//In danh sach sinh vien da in ra man hinh
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}
	//3. Kiểm tra danh sách có rỗng hay không
	public boolean kiemTraDanhSachRong() {
	 	return this.danhSach.isEmpty();
	}
	//4. Lấy ra số lượng sinh viên trong danh sách
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}
	//5. Làm rỗng danh sách sinh viên
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}
	//6. Xoá một sinh viên ra khỏi danh sách dựa trên mã sinh viên
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}
	//7. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}
	//8. Tìm kiếm một sinh viên dựa trên Tên
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if(sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}
	//9. Xuất ra danh sách sinh viên cớ điểm từ cao đến thấp
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if(sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
					return 1;
				}else if(sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
					return -1;
				}else {
					return 0;
				}
					
			}
		});
	}
}
