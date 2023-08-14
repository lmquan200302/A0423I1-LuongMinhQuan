package _10_Java_Collection_Framework.ThucHanh.TH1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {


        System.out.println("hasdMap");
        Map<String, Integer> hasdmap = new HashMap<>();
        hasdmap.put("Nguyen Van A" , 20);
        hasdmap.put("Nguyen Van B" , 27);
        hasdmap.put("Nguyen Van C" , 25);
        hasdmap.put("Nguyen Van D" , 23);
        hasdmap.put("Nguyen Van E" , 21);

        System.out.println("Hien thi" + hasdmap + "\n");


        //Tao treeMap theo thu tu giam dan
        System.out.println("treeMap");
        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Sap xep theo thu tu giam dan");
        treeMap.put("Nguyen Van D", 22);
        treeMap.put("Nguyen Van A", 18);
        treeMap.put("Nguyen Van C", 25);
        treeMap.put("Nguyen Van B", 20);
        System.out.println(treeMap + "\n");


        System.out.println("LinkedHashMap");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }




}
