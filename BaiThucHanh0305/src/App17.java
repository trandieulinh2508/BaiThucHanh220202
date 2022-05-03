import java.util.ArrayList;

public class app17 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(7);
        a.add(1);
        a.add(9);
        for (int i : a){
            System.out.println(i + "\t");
        }
    }
}