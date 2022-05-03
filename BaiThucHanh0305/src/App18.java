import java.util.ArrayList;
import java.util.Iterator;

public class app18 {
    public static void main(String[] args){
        ArrayList<Float> a = new ArrayList<>();
        a.add(0.1f);
        a.add(0.2f);
        a.add(0.3f);
        a.add(0.4f);
        Iterator<Float> i = a.iterator();
        while(i.hasNext()){
            System.out.println(i.next() + "\t");
        }
    }
}