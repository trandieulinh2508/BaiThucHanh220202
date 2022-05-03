import java.util.ArrayList;
public class app16 {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>(3);
        a.add("First element");
        a.add("Second element");
        a.add("Third element");
        a.add("bla");
        a.add("blabla");
        a.add("fifth element");
        a.set(5,"5 element");
        for (int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + ";");
        }
    }
}