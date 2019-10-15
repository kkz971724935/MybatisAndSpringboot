package com.example.mybatis.Test;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapTest {

    public static void main(String[] args) {
        Multimap<Integer,Integer> resultMap = LinkedListMultimap.create();

        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map = new HashMap<>();
            for (int j = 0; j < 10; j++) {
                if (i*j!=4) {
                    map.put(j, 1);
                }
            }
            map.forEach((k,v)->resultMap.put(k,v));
        }

        for (Integer key : resultMap.keySet()){
            System.out.println(new ArrayList<>(resultMap.get(key)).toString());
        }
        System.out.println(resultMap);
    }
}
