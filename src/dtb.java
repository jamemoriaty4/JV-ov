import java.util.Scanner;

public class dtb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float diemToan, diemLy, diemHoa, diemVan, diemAnh, diemTB;

        System.out.print("Nhập điểm Toán: ");
        diemToan = scanner.nextFloat();
        System.out.print("Nhập điểm Lý: ");
        diemLy = scanner.nextFloat();
        System.out.print("Nhập điểm Hóa: ");
        diemHoa = scanner.nextFloat();
        System.out.print("Nhập điểm Văn: ");
        diemVan = scanner.nextFloat();
        System.out.print("Nhập điểm Tiếng Anh: ");
        diemAnh = scanner.nextFloat();

        diemTB = (diemToan + diemLy + diemHoa + diemVan + diemAnh) / 5;

        String hocLuc;
        if (diemTB < 5) {
            hocLuc = "Yếu";
        } else if (diemTB < 6.5) {
            hocLuc = "Trung bình";
        } else if (diemTB < 8) {
            hocLuc = "Khá";
        } else if (diemTB < 9) {
            hocLuc = "Giỏi";
        } else {
            hocLuc = "Xuất sắc";
        }

        System.out.println("Điểm trung bình: " + diemTB);
        System.out.println("Học lực: " + hocLuc);
    }
}
