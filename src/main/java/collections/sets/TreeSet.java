package collections.sets;

public class TreeSet {
    public static <T> void main(String[] args) {
        java.util.TreeSet<T> ts = new java.util.TreeSet<>();
        ts.add((T) "sdhk");
        ts.add((T) "WD");
        ts.add((T) "fanf");

        System.out.println(ts.descendingSet());
        System.out.println(ts);
        System.out.println(ts.ceiling((T) "fanf"));
    }
}
