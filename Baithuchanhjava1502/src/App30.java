//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class App30 {
    public App30() {
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        System.out.println("Nhap vao so nguyen n: ");

        int a;
        for(int n = scanner.nextInt(); n != 0; t += a) {
            a = n % 10;
            n /= 10;
        }

        System.out.println("Tong cac phan tu cua n la: " + t);
    }
}

