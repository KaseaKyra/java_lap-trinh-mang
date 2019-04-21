public class NhanVienHopDong extends NhanVien {
    private double luongHD;
    private int loaiHD;

    NhanVienHopDong() {
    }

    NhanVienHopDong(double luongHD, int loaiHD) {
        super();
        this.luongHD = luongHD;
        this.loaiHD = loaiHD;
    }

    public double getLuongHD() {
        return luongHD;
    }

    public int getLoaiHD() {
        return loaiHD;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("\tNhap vao luong hop dong: ");
        luongHD = scanner.nextDouble();
        System.out.print("\tNhap vao loai hop dong (1 - dai han/ 2 - ngan han): ");
        loaiHD = scanner.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("\t" + luongHD + "\t" + loaiHD + "\t");
    }

}
