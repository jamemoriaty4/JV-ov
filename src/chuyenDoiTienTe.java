import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main(String[] args) {
        int k = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền cần chuyển đổi ");
        int ngoaiTe = scanner.nextInt();
        int tienViet = ngoaiTe*k;
        System.out.println("số tiền sau khi quy đổi là: "+ tienViet+" VND");
    }
}
