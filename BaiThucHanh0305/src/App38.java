import java.util.LinkedList;

public class app38{
    public static void main(String[] args){
        LinkedList<String> list= new  LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Python");

        System.out.println("Vi du su dung phuong thuc addAll()");
        LinkedList<String> a = new LinkedList<String>();
        a.addAll(list);
        System.out.println("List a");
        showList(a);
    }
    public static void showList(LinkedList<String> list){
        for (String obj : list){
            System.out.println("\t" + obj + ", ");
        }
    }
}