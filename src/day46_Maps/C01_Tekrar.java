package day46_Maps;

import java.util.*;

public class C01_Tekrar {
    public static void main(String[] args) {
        Map<Integer,String> sinifList = new HashMap<>();
        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Tester");

        /*
        1.sınıf listesini yazdırın
        2.Key ve value ları ayrı ayrı yazdırın
        3.Tum ogrencilerin isim ve soyisimlerini sira no ile alt alta yazdirin
        4.Map'de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek bir liste olusturun
        */
        System.out.println(sinifList);
        System.out.println(sinifList.keySet());
        System.out.println(sinifList.values());
        //3
        Collection<String> isimColl=sinifList.values();
        String [] arr;
        int sira=1;
        for (String each:isimColl
             ) {
            arr=each.split(", ");
            System.out.println(sira+" "+arr[0]+" "+arr[1]);
            sira++;
        }
        List<String> isimsoyisimList=new ArrayList<>();
        for (String each: isimColl
             ) {
            arr=each.split(", ");
            isimsoyisimList.add(arr[0]+" "+arr[1]);
        }
        System.out.println(isimsoyisimList);
    }
}
