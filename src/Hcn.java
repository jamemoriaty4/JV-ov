import java.util.Scanner;

public class Hcn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vào chều dài: ");
        int chieuDai = scanner.nextInt();
        System.out.println("nhap vào chều rộng: ");
        int chieuRong = scanner.nextInt();

        int chuVi = (chieuDai+chieuRong)*2;
        int dientich =chieuDai*chieuRong;
        System.out.println("chu vi hcn là: "+ chuVi);
        System.out.println("dien tich hcn là: "+ dientich);
    }
}
