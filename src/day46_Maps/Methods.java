package day46_Maps;

import java.util.*;

public class Methods {

    public static Map<Integer, String> mapOlustur() {

        Map<Integer, String> sinifListesi = new HashMap<>();
        sinifListesi.put(101, "Ali, Can, JDev");
        sinifListesi.put(102, "Enes, Cem, Tester");
        sinifListesi.put(103, "Taha, Emre, JDev");
        sinifListesi.put(104, "Derya, Deniz, Tester");

        return sinifListesi;
    }
}