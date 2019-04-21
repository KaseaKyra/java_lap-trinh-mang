//viết chương trình quản lý danh sách nhân viên: nv biên chế, nv hợp đồng
//họ tên
//mã nhân viên
//mã phòng
//nvbc có hệ số lương, số năm công tác, lương:
//nvhd: lương hđ, loại hợp đồng (ngắn hạn, dài hạn)
//nhập danh sách n nhân viên
//hiển thị danh sách nhân viên
//liệt kê danh sách theo loại
//tính tổng lương
//cho biết thông tin nhân viên hợp đông dài hạn có lương lớn nhất


import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loai, luaChon, n;
        int i = 0;

        do {
            System.out.print("Nhap so luong nhan vien: ");
            n = scanner.nextInt();
        } while (n <= 0);

        NhanVien a[] = new NhanVien[n];

        do {
            System.out.println("1.Nhan vien bien che\tNhan viem hop dong (1/2): ");
            loai = scanner.nextInt();
            if (loai == 1) {

            } else if (loai == 2) {

            } else {
                System.out.println("Lua khong khong hop le");
            }
        } while (i < n);
    }
}
