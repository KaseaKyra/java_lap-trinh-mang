import java.util.Scanner;

public class NhanVien {
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
        System.out.print("\tho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("\tma nhan vien: ");
        maNV = scanner.nextInt();
        System.out.print("\tma phong: ");
        maPhong = scanner.nextInt();
    }

    public void xuat() {
        System.out.print("\t" + hoTen + "\t" + maNV + "\t" + maPhong);
    }
}