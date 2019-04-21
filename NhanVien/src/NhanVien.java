import java.util.Scanner;

abstract public class NhanVien {
    protected String hoTen;
    protected int maNV;
    protected int maPhong;


    Scanner scanner = new Scanner(System.in);

    public NhanVien() {

    }

    public NhanVien(String hoTen, int maNV, int maPhong) {
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.maPhong = maPhong;
    }

    public void nhap() {
        System.out.println("\tho ten: ");
        hoTen = scanner.nextLine();
        System.out.println("\tma nhan vien: ");
        maNV = scanner.nextInt();
        System.out.println("\tma phong: ");
        maPhong = scanner.nextInt();
    }

    public void xuat() {
        System.out.print(hoTen + " " + maNV + " " + maPhong + " ");
    }

    public double tinhLuong() = 0
}