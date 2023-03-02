import java.util.Scanner;
public class b97 {
    public static void main(String[] args) {
        long a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println(" Nhập độ dài 3 cạnh : ");
        a = in.nextLong();
        b = in.nextLong();
        c = in.nextLong();

        if (a == b && a == c && b != c) {
            System.out.println("Đây là tam giác cân");
        } else if (a == b && c == b && a == c) {
            System.out.println("Đây là tam giác đều");
        } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a) {
            System.out.println("Đây là tam giác vuông");
        } else if (c >=(a + b)  || a >= (b + c) || b >=(a + c) ) {
            System.out.println("Đây không phải ba cạnh tam giác");
        } else {
            System.out.println("Đây là tam giác thường");
        }
    }
}
