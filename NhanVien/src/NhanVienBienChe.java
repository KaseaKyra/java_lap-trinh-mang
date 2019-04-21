public class NhanVienBienChe extends NhanVien {
    private double heSoLuong;
    private int soNam;

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
        System.out.print("\tNhap vao he so luong: ");
        heSoLuong = scanner.nextDouble();
        System.out.print("\tNhap vao so nam cong tac: ");
        soNam = scanner.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("\t" + heSoLuong + "\t" + soNam + "\t");
    }

    public double tinhLuong() {
        return heSoLuong * soNam * 1000000;
    }
}
