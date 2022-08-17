package day47_maps;

import day46_Maps.ReusableMethods;

import java.util.*;

public class C03_Update {
    public static void main(String[] args) {
         /*
          map.contains(key) ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
          map.contains(value) ==> bir butun olarak value'nun map'de olup olmadigini doner
          ONEMLI NOT : map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                      eger value icindeki bir parcayi aratmak istiyorsak
                      map uzerinde manipulation yapmamiz lazim
           map.get(key) ==> verilen key'e ait degeri dondurur
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("i");
        String isim=scan.next();

        System.out.println("s");
        String soyisim=scan.next();

        System.out.println("m");
        String meslek=scan.next();


        Map<Integer,String > kullaici=new HashMap<>();
        String yenikayit=isim+", "+soyisim+", "+meslek;


        kullaici.put(sayi,yenikayit);
        System.out.println(kullaici);


        Map<Integer,String > sinifListMap= ReusableMethods.mapOlustur();
        sinifListMap.put(sayi,yenikayit);
        System.out.println(sinifListMap);
        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false
        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true
        System.out.println(sinifListMap.containsValue("JDev")); // false
        // Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value'yu degistirmek istersek kullanilabilir
        // kismi degisikliklerde kullanamayiz
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);
        // Map'i guncelleme yapmak icin key, yenideger'i map'e eklemeliyiz
        // ornegin key 101 icin value Ali, Can, JDev
        // guncelleme icin sinifListMap.put(101,Ali, Can, JavaDeveloper)
        // bunu yapabilmek icin herbir key'e ve ona ait value'ye ihtiyacim var

        Set<Integer> keySeti=sinifListMap.keySet();
        String degisecek;
        for (Integer each:keySeti
             ) {
           degisecek=sinifListMap.get(each);
           degisecek=degisecek.replace("Tester","QA");
           sinifListMap.put(each,degisecek);
        }
        System.out.println(sinifListMap);













       /* Set<Integer> keySeti = sinifListMap.keySet();
        String eachValue;
        for (Integer each:keySeti
        ) {
            eachValue= sinifListMap.get(each);
            eachValue=eachValue.replace("JDev", "JavaDeveloper");
            sinifListMap.put(each,eachValue);
            /*
             biz key'lerin tamamini aldik
             herbir key'in value'sunu get'irdik
             value uzerinde degisikligi yapip
             yeni halini put(key, yeniDeger) ile map'e koyduk
             */
        /*}
        System.out.println(sinifListMap); */

    }
}