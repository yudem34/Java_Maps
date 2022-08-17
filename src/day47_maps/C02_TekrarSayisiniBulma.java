package day47_maps;

import java.util.*;

public class C02_TekrarSayisiniBulma {
    public static void main(String[] args) {
        // Verilen bir String'deki kullanilan harfleri
        // ve kullanilan harflerin tekrar sayisini
        // H = 20 seklinde yazdirin

        String str= "Heeeeellllooooo Woooorrrrllllllddddd.";
        String [] arr2=str.replaceAll("\\W","").split("");
        Map<String,Integer> harf=new TreeMap<>();
        Integer count;
        for (String each:arr2
             ) {
            if (!harf.containsKey(each)){
                harf.put(each,1);
            }else {
                count=harf.get(each);
                harf.put(each,count+1);
            }
        }
        System.out.println(harf);


























       /* // space'leri saymamasi icin once onlari yok edelim
        str=str.replaceAll("\\W","");
        String[] harflerArr=str.split("");
        System.out.println(Arrays.toString(harflerArr));

        // [H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]
        // H=1 e=4 l=4
        // harfleri key, kullanim adedini value yaparak bir map olusturalim
        Map<String,Integer> harfKullanimsayilariMap= new TreeMap<>();
        Integer harfKullanimsayisi;
        for (String each: harflerArr
        ) {
            if (!harfKullanimsayilariMap.containsKey(each)){
                harfKullanimsayilariMap.put(each,1);
            }else{
                harfKullanimsayisi=harfKullanimsayilariMap.get(each);
                harfKullanimsayilariMap.put(each,++harfKullanimsayisi);
            }
        }
        System.out.println(harfKullanimsayilariMap);*/
    }
}
