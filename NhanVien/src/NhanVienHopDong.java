public class NhanVienHopDong extends NhanVien {
    double luongHD;
    String loaiHd;

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("\nNhap vao luong hop dong: ");
        luongHD = scanner.nextDouble();
        System.out.print("\nNhap vao loai hop dong: ");
        loaiHd = scanner.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(luongHD + " " + loaiHd + " ");
    }


}
