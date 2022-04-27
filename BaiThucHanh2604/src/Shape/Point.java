package Shapes;

public class Point {
    public double x;
    public double y;
    public char c;
    public String name;

    public double AB ,BC, AC,CD,DA;

    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Viết Phương thức get, set cho lớp Point.
    public double getX() {
        return x;
    }
    public double getAB() {
        return AB;
    }

    public double getAC() {
        return AC;
    }
    public double getBC() {
        return BC;
    }

    public void setAB( double AB) {
        this.AB=AB;
    }
    public void setAC( double AC) {
        this.AC=AC;
    }
    public void setBC( double BC) {
        this.BC=BC;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Viết Phương thức nhập một điểm từ bàn phím
    public void setPointXY(String name,double x, double y){
        this.name=name;
        this.x = x;
        this.y = y;
    }

    // Viết Phương thức khởi tạo nhận một ký tự và 2 số thực làm tham số.
    public void setCXY(char c,double x,double y){
        this.c=c;
        this.x=x;
        this.y=y;
    }

    // Viết phướng thức in ra thông tin 1 điểm theo dịnh dạng: A(2,3)
    public void getPointXY(){
        System.out.println("Diem "+name+" co toa do la: " + name+"("+x  +";" +y+")");
    }


}