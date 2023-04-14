package com.itheima.set;
import java.util.HashSet;











public class HashCodeTest2 {
    public static void main(String[] args) {

        System.out.println(("a".hashCode() ^ ("a".hashCode() >>> 16)) % 16);
        System.out.println(("b".hashCode() ^ ("b".hashCode() >>> 16)) % 16);
        System.out.println(("c".hashCode() ^ ("c".hashCode() >>> 16)) % 16);
        System.out.println(("p".hashCode() ^ ("p".hashCode() >>> 16)) % 16);
        System.out.println(("q".hashCode() ^ ("q".hashCode() >>> 16)) % 16);

        HashSet<String> hs = new HashSet<>();
        hs.add("b");
        hs.add("a");
        hs.add("c");
        hs.add("p");
        hs.add("q");

        System.out.println(hs);

    }
}




