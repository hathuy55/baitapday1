import java.util.Scanner;

public class b96 {
    // Viết chương trình nhập giá trị x sau khi tính giá trị của hàm số
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x= in.nextInt();
        in.close();
        if ( x >= 5) {
            System.out.println(" f(x) = "+ (2*x*x +5*x +9));
        }
        if (x < 5){
            System.out.println(" f(x) = " + (-2*x*x + 4*x -9));
        }
    }
}
