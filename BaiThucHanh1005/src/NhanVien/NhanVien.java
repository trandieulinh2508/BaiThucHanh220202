package Nhanvien;
public class nhanvien{
    int id;
    String name;
    String address;
    public nhanvien(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void nhapthongtin(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void display(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}