package collections.sets;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> ts = new java.util.HashSet<>();
        ts.add("sdhk");
        ts.add("WD");
        ts.add("fanf");

        System.out.println(ts.stream().count());
        System.out.println(ts);
    }
}
