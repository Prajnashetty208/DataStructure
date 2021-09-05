package collections.maps;

public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<String, Integer> tm = new java.util.TreeMap<>();
        tm.put("djncs",7878);
        tm.put("asnhj",234);
        tm.put("snkjan",123);

        System.out.println(tm.entrySet());
        System.out.println(tm.descendingKeySet());
        System.out.println(tm.descendingMap());
        System.out.println(tm.navigableKeySet());
        System.out.println(tm.higherEntry("djncs"));
    }

}
