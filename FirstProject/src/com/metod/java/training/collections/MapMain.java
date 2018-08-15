package com.metod.java.training.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapMain {
    public static void main(final String[] args) {
        Map<String, MySetObj> map = new HashMap<>();

        MySetObj mySetObj = new MySetObj();
        mySetObj.setString("osman");
        mySetObj.setA(10);

        map.put("osman", mySetObj);

        MySetObj mySetObj2 = new MySetObj();
        mySetObj2.setString("mehmet");
        mySetObj2.setA(10);

        map.put("ahmet", mySetObj2);

        MySetObj mySetObj3 = map.get("ahmet");

        // 1
        Set<String> keySet = map.keySet();
        for (String string : keySet) {
            MySetObj mySetObj4 = map.get(string);
        }

        // 2
        Collection<MySetObj> values = map.values();
        for (MySetObj mySetObj4 : values) {

        }

        // 3
        Set<Entry<String, MySetObj>> entrySet = map.entrySet();
        for (Entry<String, MySetObj> entry : entrySet) {
            entry.getKey();
            entry.getValue();
        }

        Map<String, MySetObj> cmap = new ConcurrentHashMap<>(2_400_000,
                                                             0.9f,
                                                             10_000);

    }
}
