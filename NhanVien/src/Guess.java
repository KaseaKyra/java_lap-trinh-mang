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
        int loai, n;
        String luaChon = "";
        int i = 0;
        double tongLuong = 0;
        double luongCaoNhat = 0;

        do {
            System.out.print("Nhap so luong nhan vien: ");
            n = scanner.nextInt();
        } while (n <= 0);

        NhanVien a[] = new NhanVien[n];

        // nhap danh sach nv
        do {
            System.out.println("1.Nhan vien bien che\n2.Nhan viem hop dong");
            System.out.print("Chon (1/2): ");
            loai = scanner.nextInt();

            if (loai == 1) {
                a[i] = new NhanVien();// a[i] = new NhanVienBienChe();
                NhanVienBienChe nv = new NhanVienBienChe(); // a[i] = new NhanVienBienChe();
                a[i] = nv;
                a[i].nhap();
                i++;
            } else if (loai == 2) {
                a[i] = new NhanVien();
                NhanVienHopDong nv = new NhanVienHopDong();
                a[i] = nv;
                a[i].nhap();
                i++;
            } else {
                System.out.println("Lua chon khong khong hop le");
            }

            scanner.nextLine();

            if (i < n) {
                System.out.println("Ban co muon nhap tiep? (y/n)");
                luaChon = scanner.nextLine();
            }
        } while (i < n && luaChon.equalsIgnoreCase("y"));

//        cách khác để nhập nhân viên
/*        for (int j = 0; j< n; j++) {
            System.out.println("nhap vao loai nhan vien: ");
            int check = scanner.nextInt();
            if (check == 1) {
                a[i] = new NhanVienBienChe();
            } else {
                a[i] = new NhanVienHopDong();
            }
            a[i].nhap();
        }*/

        // in ra ds nv chung
        System.out.println("********** Danh sach nhan vien **********");
        for (int j = 0; j < i; j++) {
            a[j].xuat();
        }

        // in ra ds nv bien che
        System.out.println("********** Danh sach nhan vien bien che **********");
        for (int j = 0; j < i; j++) {
            if (a[j] instanceof NhanVienBienChe) {
                NhanVienBienChe nv = (NhanVienBienChe) a[j];
                nv.xuat();
                tongLuong += nv.tinhLuong();
            }
        }

        // in ra ds nv hop dong
        System.out.println("********** Danh sach nhan vien hop dong **********");
        for (int j = 0; j < i; j++) {
            if (a[j] instanceof NhanVienHopDong) {
                NhanVienHopDong nv = (NhanVienHopDong) a[j];
                nv.xuat();
                tongLuong += nv.getLuongHD();
            }
        }

        // tinh tong luong
//        for (int j = 0; j < i; j++) {
//            if (a[j] instanceof NhanVienBienChe) {
//                NhanVienBienChe nv = (NhanVienBienChe) a[j];
//
//            }
//            if (a[j] instanceof NhanVienHopDong) {
//                NhanVienHopDong nv = (NhanVienHopDong) a[j];
//
//            }
//        }
        System.out.println("Tong luong cua cac nhan vien la: " + tongLuong);

        // tim luong cao nhat
        for (int j = 0; j < i; j++) {
            if (a[j] instanceof NhanVienHopDong) {
                NhanVienHopDong nv = (NhanVienHopDong) a[j];
                if (nv.getLoaiHD() == 1) {
                    if (nv.getLuongHD() > luongCaoNhat) {
                        luongCaoNhat = nv.getLuongHD();
                    }
                }
            }
        }

        // in ra cac nhan vien hop dong dai han co luong cao nhat
        System.out.println("********** Danh sach nhan vien hop dong dai han co luong cao nhat **********");
        for (int j = 0; j < i; j++) {
            if (a[j] instanceof NhanVienHopDong) {
                NhanVienHopDong nv = (NhanVienHopDong) a[j];
                if (nv.getLoaiHD() == 1) {
                    if (nv.getLuongHD() == luongCaoNhat) {
                        nv.xuat();
                    }
                }
            }
        }
    }
}
