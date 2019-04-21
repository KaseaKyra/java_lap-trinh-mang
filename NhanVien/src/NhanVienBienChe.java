public class NhanVienBienChe extends NhanVien {
    double heSoLuong;
    int soNam;
    double luong;

    NhanVienBienChe() {
    }

    NhanVienBienChe(double heSoLuong, int soNam) {
        super();
        this.heSoLuong = heSoLuong;
        this.soNam = soNam;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("\nNhap vao he so luong: ");
        heSoLuong = scanner.nextDouble();
        System.out.print("\nNhap vao so nam cong tac: ");
        soNam = scanner.nextInt();
        System.out.print("\nNhap vao luong: ");
        luong = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(heSoLuong +" " + soNam + " ");
    }

    @Override
    public double tinhLuong() {
//        super.tinhLuong();
        return heSoLuong * soNam * 1000000;
    }
}
