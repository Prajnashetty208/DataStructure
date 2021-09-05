package collections.sets;

public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<String> ts = new java.util.LinkedHashSet<>();
        ts.add("sdhk");
        ts.add("WD");
        ts.add("fanf");

        System.out.println(ts.stream().count());
        System.out.println(ts);
    }
}
