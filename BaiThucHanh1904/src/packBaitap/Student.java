package packBaiTap;

public class Student extends Person {
    private double gpa;
    public Student(String name, int age, double gpa){
        super(name, age);
        this.gpa = gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("GPA: " + gpa);
    }
}
