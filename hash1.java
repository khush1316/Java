import java.util.HashSet;

public class hash1 {
    public static void main(String[] args) {
        HashSet<Integer> t=new HashSet<Integer>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(2);
        t.add(4);
        System.out.println(t);
    }
}
