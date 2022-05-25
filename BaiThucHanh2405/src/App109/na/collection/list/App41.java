import java.util.LinkedList;
import java.util.Scanner;

public class app41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> a = new LinkedList<String>();
        a.add("Thang 1");
        a.add("Thang 2");
        a.add("Thang 3");
        a.add("Thang 4");
        a.add("Thang 5");
        a.add("Thang 6");
        a.add("Thang 7");
        a.add("Thang 8");
        a.add("Thang 9");
        a.add("Thang 10");
        a.add("Thang 11");
        a.add("Thang 12");

        System.out.println("Nhap chi so cua phan tu can lay" );
        int i = sc.nextInt();

        if(i < 0 || i > a.size()-1){
            System.out.println("Chi so can lon hon 0 a nho hon " + (a.size()-1));
        } else{
            String node = a.get(i);
            System.out.println("Phan tu co chi so " + i + " trong  Linkedlist la: " + node);

        }
        String firstNode =  a.getFirst();
        String lastNode = a.getLast();
        System.out.println("Phan tu dau tien trong linkList la: " + firstNode + "; Phan tu cuoi la: " + lastNode);
    }
}