package com.test;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author YangLiang
 * @create 2019-11-13-21:33
 */
public class TestTemplate {
    //模板六：prsf:
    private static final int id = 0;
    //变形:psf
    public static final int id2 = 1;
    //psfi
    public static final int id3 = 2;
    //psfs
    public static final String name = "zhangsan";
    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello!");
        //变形：soutp/ soutm/ soutv/ xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TestTemplate.main");
        int num1 = 0;
        int num2 = 1;
        System.out.println("num1 = " + num1);
        System.out.println(num2);
        //模板三：fori
        String[] arr = new String[]{"tom", "Jerry", "Lilei", "Hanmeimei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(010);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        method();

    }

    public static void method() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(010);
        //模板五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn
        if (list != null) {

        }
        // 变形：xx. null
        if (list == null) {

        }
    }
    //test
    public void testUpdate() {
        System.out.println("haha");
    }
}
