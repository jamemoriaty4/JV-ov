import java.util.Scanner;

public class chiaHet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so cần kiểm : ");
        int x;
        x = scanner.nextInt();
        if(x%3==0&&x%5==0){
            System.out.println(x+ " chia hết cho 3 và 5");
        }else System.out.println(x+ " không chia hết cho 3 và 5");
    }
}
