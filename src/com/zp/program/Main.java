package com.zp.program;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Captain_Z on 2016/9/9.
 */
public class Main {
    /**
     * 打印对象
     *
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d},%s", index, obj.toString()));
    }

    /**
     * 一些常见的运算
     */
    public static void classicOperation() {
        print(2, 5 + 2);
        print(3, 5 - 2);
        print(4, 5 / 2);
        print(5, 5 * 2);
        print(6, 5 & 2);
        print(7, 5 | 2);
        print(8, 5 ^ 2);
        print(9, 5 >> 2);
        print(10, 5 << 2);
        print(11, 5 == 2);
        print(12, 5 != 2);
    }

    /**
     * 常见控制流
     */
    public static void controlFlow() {
        String str = "B";
        switch (str) {
            case ("A"):
                print(13, "80~100");
                break;
            case ("B"):
                print(14, "60~79");
                break;
            case ("C"):
                print(15, "0~59");
        }
        String str1 = "hello";
        for (char i : str1.toCharArray()) {
            print(16, i);
        }
    }

    /**
     * List的一些常见的操作
     */
    public static void practiceList() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            list.add(String.valueOf(i * i));
        }
        List<String> list1 = Arrays.asList(new String[]{"3", "1", "4"});
        list.addAll(list1);
        Collections.sort(list);
        print(17, list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(18, list);
        Random ran = new Random();
        ran.setSeed(1);//设置了种子即起始数，无乱打乱几次都不会变，伪随机数是一个公式
        Collections.shuffle(list, ran);//打乱
        print(18, list);
    }

    /**
     * 常见的map操作
     */
    public static void practiceKeyValue() {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 5; i++) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        for (Map.Entry<String, String> i : map.entrySet()) {
            print(19, i.getKey() + ":" + i.getValue());
        }
        print(20, map.keySet());
        print(21, map.values());
        print(22, map.get("3"));
        print(23, map.replace("4", "20"));
        for (Map.Entry<String, String> i : map.entrySet()) {
            print(24, i.getKey() + ":" + i.getValue());
        }
    }

    /**
     * 异常的用法
     */
    public static void practiceException() {
        try {
            int num = 4;
            int result = 4 / 0;
            print(25, result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            print(26, "出现异常已处理");
        }
    }

    /**
     * 随机类的简单使用
     */
    public static void practiceRandom() {
        Random ran = new Random();
        //ran.setSeed(1);//设置了种子每次随机都一样，即伪随机
        for (int i = 0; i < 3; i++) {
            print(27, ran.nextInt(10));
            print(27, ran.nextDouble());
        }
    }

    /**
     * 日期类的常用方法
     */
    public static void practiceDate() {
        Date date = new Date();
        print(28, date);
        print(29, date.getTime());//毫秒数
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");//不熟要记
        print(30, df.format(date));
        print(31, DateFormat.getDateInstance(DateFormat.FULL).format(date));//DateFormat.getDateInstance返回DateFormat
    }

    /**
     * 数学类的一些用法
     */
    public static void practiceMath() {
        print(32, Math.max(1, 3));
        print(33, Math.ceil(3.1415926));
        print(34, Math.floor(3.1415926));
        print(35, Math.abs(-3.1415926));
        print(36, Math.log(4.0));//以e为底
        print(37, Math.log10(100.0));
    }

    /**
     * 面向对象的使用
     */
    public static void demoAnimal() {
        Animal an = new Animal("Da Huang", 2);
        an.say();
    }

    public static void demoHuman() {
        Human hu = new Human("zp", 23, "China");
        hu.say();
    }

    public static void demoObject() {
        Talk tt = new Animal("Xiao Huang", 3);
        tt.say();
        tt = new Human("zp1", 23, "USA");
        tt.say();
    }

    public static void main(String[] args) {
        print(1, "Hello world!");
        classicOperation();
        controlFlow();
        practiceList();
        practiceKeyValue();
        practiceException();
        practiceRandom();
        practiceDate();
        practiceMath();
        demoAnimal();
        demoHuman();
        demoObject();
    }
}
