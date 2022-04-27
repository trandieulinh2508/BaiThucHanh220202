package Shapes;
import java.util.Scanner;
/* Viết phương thức nhập vào 3 điểm từ bàn phím
 kiểm tra xem 3 điểm đó có tạo thành 1 tam giác hay không?
 Nếu có thì là tam giác loại gì và in thông tin ra màn hình?*/
public class Triangle extends Point {
    public Triangle(){}

    public double getdodai2diem(Point a, Point b){
        double kq=(Math.sqrt((b.x-a.x)*(b.x-a.x) + (b.y-a.y)*(b.y-a.y)));
        return kq;
    }

    public  void check(){
        Scanner sc = new Scanner(System.in );
        System.out.println("nhap diem Ax");
        double ax = sc.nextDouble();

        System.out.println("nhap diem Ay");
        double ay = sc.nextDouble();

        System.out.println("nhap diem Bx");
        double bx = sc.nextDouble();

        System.out.println("nhap diem By");
        double by = sc.nextDouble();

        System.out.println("nhap diem Cx");
        double cx = sc.nextDouble();

        System.out.println("nhap diem Cy");
        double cy = sc.nextDouble();

        sc.close();




        double AB=(Math.sqrt((bx-ax)*(bx-ax) + (by-ay)*(by-ay)));
        double BC=(Math.sqrt((cx-bx)*(cx-bx) + (cy-by)*(cy-by)));
        double AC=(Math.sqrt((cx-ax)*(cx-ax) + (cy-ay)*(cy-ay)));
        System.out.println(AB);
        System.out.println(BC);
        System.out.println(AC);
        if(ax==bx && ay==by|| bx ==cx && by==cy || cx == ax && cy == ay){
            System.out.println("day khong phai tam giac vi co diem trung nhau");
        }else if(AB==BC||AB==AC||AC==BC){
            System.out.println("tam giac la tam giac can");
        }else if(AB==BC&&AB==AC&&AC==BC){
            System.out.println("tam giac la tam giac deu");
        }else{
            System.out.println("tam giac la tam giac thuong");
        }


    }

}