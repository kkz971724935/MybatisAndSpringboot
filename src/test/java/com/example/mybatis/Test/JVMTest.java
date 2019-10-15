package com.example.mybatis.Test;

import java.math.BigDecimal;

public class JVMTest {
    public static String val = "11-no final";
    public static final String value ="2312-final";

    JVMTest(){
        System.out.println("a");
    }

    public static void main(String[] args){

        System.out.println(val);
        System.out.println(value);

        BigDecimal bigDecimal1 = new BigDecimal(1);
        BigDecimal bigDecimal2= new BigDecimal(2);
        System.out.println(bigDecimal1.subtract(bigDecimal2).divide(new BigDecimal(1)).abs());

    }
}
