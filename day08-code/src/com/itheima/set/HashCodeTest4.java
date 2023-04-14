package com.itheima.set;

public class HashCodeTest4 {
    public static void main(String[] args) {


        System.out.println(("a".hashCode() ^ ("a".hashCode() >>> 16)) % 32);
        System.out.println(("q".hashCode() ^ ("q".hashCode() >>> 16)) % 32);
        System.out.println(("Ñ".hashCode() ^ ("Ñ".hashCode() >>> 16)) % 32);
        System.out.println(("á".hashCode() ^ ("á".hashCode() >>> 16)) % 32);
        System.out.println(("ñ".hashCode() ^ ("ñ".hashCode() >>> 16)) % 32);
        System.out.println(("ā".hashCode() ^ ("b".hashCode() >>> 16)) % 32);
        System.out.println(("Α".hashCode() ^ ("c".hashCode() >>> 16)) % 32);
        System.out.println(("Ǒ".hashCode() ^ ("Ǒ".hashCode() >>> 16)) % 32);
        System.out.println(("Ł".hashCode() ^ ("Ł".hashCode() >>> 16)) % 32);

    }
}


