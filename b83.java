import java.util.Scanner;
public class b83 {
    public static void main(String[] args) {
        // Viết chương trình nhập vào hai số thực. Kiểm tra xem chúng có cùng
        //dấu hay không.
        double x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập x và y :");
        x = in.nextDouble();
        y = in.nextDouble();

        if(x == 0 || y == 0){
            System.out.println("Không hợp lệ");
            System.exit(0);
        }
        if(x * y < 0){
            System.out.println(" cả 2 khác dấu");
        }else {
            System.out.println(" cả 2 cùng dấu");
        }
    }
}
