import java.util.Scanner;

public class b82 {
        public static void main (String [] args ){
            //viết chương trình tìm số lớn nhất trong ba số thực a, b,c
            Scanner in = new Scanner(System.in);
            System.out.print("a =  ");
            int a = in.nextInt();
            System.out.print("b =  ");
            int b = in.nextInt();
            System.out.print("c = ");
            int c = in.nextInt();
            in.close();
            if(b > a && c > b){
                System.out.println("Số lớn nhất là : " + c);
            }else if(b > a && c < b){
                System.out.println("Số lớn nhất là : " + b);
            }else System.out.println("Số lớn nhất là :" + a);