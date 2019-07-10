package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        //key value로 구성
        Map<String, Integer> map =new HashMap<>();
        map.put("kor",100);
        map.put("mat",100);
        map.put("Eng",100);
        map.put("Eng",90);
        printmap(map);

        System.out.println(map.get("kor"));
        System.out.println(map.get("sci"));

        map.remove("eng");
        printmap(map);
        map.clear();
        printmap(map);


        Map<String, List<String>> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("노래1");
        list.add("노래2");
        map2.put("댄스",list);

        //List : Map<String,String>
        List<Map<String,String>>list2 = new ArrayList<>();
        Map<String,String> map3 = new HashMap<>();
        map3.put("댄스","노래1");
        map3.put("발라드","노래2");
        list2.add(map3);
    }

    private static void printmap(Map<String, Integer> map) {
        for(String key :map.keySet()){
            System.out.println(key +":" +map.get(key) + "|");
        }

    }
}
