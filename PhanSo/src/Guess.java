import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap so luong phan tu: ");
            n = scanner.nextInt();
        } while (n <= 0);

        PhanSo a[] = new PhanSo[n];
        PhanSo tong = new PhanSo();

        System.out.println("Nhap vao day phan so");
        for (int i = 0; i < n; i++) {
            a[i] = new PhanSo();
            a[i].nhap();
            a[i].toiGian();
            tong = tong.cong(a[i]);
        }

        PhanSo max = a[0];

        for (int i = 0; i < n; i++) {
            if (max.soSanh(a[i])) {
                max = a[i];
            }
        }

        System.out.println("xuat ra day phan so sau khi toi gian: ");
        for (int i = 0; i < n; i++) {
            a[i].toiGian();
        }

        System.out.println("Phan so lon nhat la: ");
        max.xuat();

        System.out.println("Tong cac phan so la: ");
        tong.xuat();
    }
}
