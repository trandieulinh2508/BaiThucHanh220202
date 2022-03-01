import java.util.Scanner;



public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int n, t = 0, a;

        System.out.println("Nhap vao so nguyen n: ");

        n = scanner.nextInt();

        while ( n != 0)

        {

            a = n % 10;

            n =  n / 10;

            t += a;

        }

        System.out.println("Tong cac phan tu cua n la: " + t);

    }

}
