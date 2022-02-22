import static java.lang.Math.sqrt;
import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập vào 1 số bất kỳ: ");
        int a = s.nextInt();
        App3 snt = new App3();
        if (snt.checkSNTC1(a) == true) {
            System.out.println(a + " là số nguyên tố");
        } else {
            System.out.println(a + " không phải là số nguyên tố");
        }
    }


    public boolean checkSNTC1(int soA) {
        if (soA < 2) {
            return false;
        } else {
            for (int i = 2; i <= sqrt((float) soA); i++) {
                if (soA % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
