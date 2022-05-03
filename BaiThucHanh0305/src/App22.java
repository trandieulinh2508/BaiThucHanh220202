import java.util.ArrayList;
import java.util.Scanner;

public class app22 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("So phan tu mang: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print("a[" + i + "]: ");
            int element = sc.nextInt();
            a.add(element);
        }
        sc.close();
        int max = a.get(0);
        for (int i = 1; i < n; i++){
            if (a.get(i) > max){
                max = a.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong list la: " + max);
    }
}