package com.example.mybatis.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortTest {
    public static void main(String []args){
        BigDecimal bd1 = new BigDecimal(1);
        BigDecimal bd2 = new BigDecimal(2);
        BigDecimal bd3 = new BigDecimal(3);
        BigDecimal bd4 = new BigDecimal(4);
        BigDecimal bd5 = new BigDecimal(5);

        List<BigDecimal> list = new ArrayList<>();

        System.out.println(bd1.subtract(bd2).divide(bd2,3,BigDecimal.ROUND_HALF_UP));

        list.add(bd1);
        list.add(bd2);
        list.add(bd3);
        list.add(bd4);
        list.add(bd5);
        list.sort(Collections.reverseOrder());
        System.out.println(list);
        System.out.println(list.get(0).add(list.get(1)).add(list.get(2)));
        //list.remove(list.size()-1);
        //list.remove(list.size()-1);
        System.out.println(list.subList(2,list.size()-2));

        String url ="[\"http://huzhu-public-test.oss-cn-shanghai.aliyuncs.com/test/a5619f99-4ade-4c92-81ac-db72e3246b51.jpeg\",\"http://huzhu-public-test.oss-cn-shanghai.aliyuncs.com/test/dc116000-4faf-44f0-b72c-31165d0efe47.png\"]";

        url = url.substring(1,url.length()-1);
        System.out.println(url);

    }



}
