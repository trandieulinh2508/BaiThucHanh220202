package Shapes;
import java.util.Scanner;
// Viết phương thức nhập vào 4 điểm từ bàn phím,
//  kiểm tra xem 4 điểm đó có tạo thành 1 tứ giác hay không?
//  Nếu có thì là tứ giác loại gì và in thông tin ra màn hình?
public class Quadrilateral extends Point{

    Quadrilateral(){}
    Scanner sc = new Scanner(System.in );

    // chong ham
    public void check(){
        System.out.println("Nhap diem Ax");
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

        System.out.println("nhap diem Dx");
        double dx = sc.nextDouble();

        System.out.println("nhap diem Dy");
        double dy = sc.nextDouble();

        sc.close();

        double AB=(Math.sqrt((bx-ax)*(bx-ax) + (by-ay)*(by-ay)));
        double BC=(Math.sqrt((cx-bx)*(cx-bx) + (cy-by)*(cy-by)));
        double CD=(Math.sqrt((dx-cx)*(dx-cx) + (dy-cy)*(dy-cy)));
        double DA=(Math.sqrt((dx-ax)*(dx-ax) + (dy-ay)*(dy-ay)));

        if(ax==bx && ay==by|| bx ==cx && by==cy || cx == dx && cy == dy || ax == dx &&ay==dy){
            System.out.println("day khong phai tu giac vi co diem trung nhau");
        }else if(AB==BC && BC==CD && CD==DA) {
            System.out.println("day la tu giac dac biet: hinh vuong");
        }else if(AB==CD&&BC==DA){
            System.out.println("day la day la tu giac dac biet: hinh chu nhat");
        }

    }

}