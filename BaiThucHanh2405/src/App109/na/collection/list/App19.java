import java.util.ArrayList;
import java.util.ListIterator;

public class app19 {
    public static void main(String[] args){
        ArrayList<Character> a = new ArrayList<>();
        a.add('a');
        a.add('b');
        a.add('c');
        a.add('d');
        ListIterator<Character> i = a.listIterator();
        while(i.hasNext()){
            System.out.println(i.next() + "\t");
        }
    }
}
