import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) {
        String name ;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");

        System.out.println("Cac phan tu trong hashSetString:");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa:");
        name = scanner.nextline();

        if (hashSetString.contain(name)) {
            System.out.println(x:"Xoa thanh cong!");
            System.out.println("Cac phan tu trong App56 sau khi xoa: " + hashSetString);
        } else {
            System.out.println(x:"Xoa khong thanh cong!");
        }
    }
}
