package com.study.java;

public class Variable1 {
    public static void main(String[] args) {
        int level; //
        int _level; //가능
        int $level; //가능
        //int 1level; //숫자앞 불가
        //int while;  //예약어불가
        // _level,$level, 1level while
        level = 10;
        _level=11;
        $level=12;
        /*F:\JAVAPROJECT\First\src\com\study\java\Variable1.java:7:28
        java: variable level might not have been initialized*/
        System.out.println(level);
        System.out.println(_level);
        System.out.println($level);
    }
}
