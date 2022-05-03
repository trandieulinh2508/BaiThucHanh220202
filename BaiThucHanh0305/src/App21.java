import java.util.ArrayList;


public class app21 {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>();
        a.add("green");
        a.add("red");
        a.add("purple");
        a.add("yellow");
        System.out.println(a.get(1));
        System.out.println(a.contains("green"));
        System.out.println(a.size());
        System.out.println(a);
    }
}