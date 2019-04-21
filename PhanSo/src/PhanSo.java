import java.awt.*;
import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;

    Scanner scanner = new Scanner(System.in);

    PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public void nhap() {
        System.out.print("\ttu: ");
        this.tu = scanner.nextInt();
        System.out.print("\tmau: ");
        this.mau = scanner.nextInt();
    }

    public void xuat() {
        System.out.println(tu + "/" + mau);
    }

    private int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toiGian() {
        int u = timUCLN(tu, mau);
        tu = tu / u;
        mau = mau / u;
//        System.out.println(tu + "/" + mau);
    }

    PhanSo cong(PhanSo p) {
        PhanSo c = new PhanSo();
        c.tu = tu * p.mau + mau * p.tu;
        c.mau = mau * p.mau;
        return c;
    }

    boolean soSanh(PhanSo p) {
        return (tu * 1.0) / mau > (p.tu * 1.0) / p.mau;
    }
}
