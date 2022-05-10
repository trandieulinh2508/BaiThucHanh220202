import java.util.ArrayList;
import java.util.Scanner;

public class App110 {
    public App110() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        System.out.println("Nhap so phan tu cua list: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max;
        int x;
        for(max = 0; max < n; ++max) {
            System.out.println("Phan tu thu " + max + ": ");
            x = sc.nextInt();
            a.add(x);
        }

        max = (Integer)a.get(0);

        for(x = 1; x < n; ++x) {
            if ((Integer)a.get(x) > max) {
                max = (Integer)a.get(x);
            }
        }

        System.out.println("Phan tu co gia tri lon nhat trong mang la: " + max);
        System.out.print("Xoa cac phan tu co gia tri bang: ");
        x = sc.nextInt();

        int i;
        for(i = 0; i < a.size(); ++i) {
            if ((Integer)a.get(i) == x) {
                a.remove(i);
            }
        }

        System.out.println("List sau khi xoa:");

        for(i = 0; i < a.size(); ++i) {
            System.out.print(a.get(i) + " ");
        }

        System.out.println("");
        System.out.print("List sau khi sap xep: ");

        for(i = 0; i < a.size() - 1; ++i) {
            for(int j = i + 1; i < a.size(); ++j) {
                if ((Integer)a.get(i) > (Integer)a.get(j)) {
                    int temp = (Integer)a.get(i);
                    a.set(i, (Integer)a.get(j));
                    a.set(j, temp);
                }
            }
        }

        System.out.print("List sau khi sap xep: ");

        for(i = 0; i < a.size(); ++i) {
            System.out.print(a.get(i) + " ");
        }

    }
}