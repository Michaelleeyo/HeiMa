package day12.demo01;

import java.util.Objects;

public class Dem03Object {
    public static void main(String[] args) {
        //String s1 = "abc";
        String s1 = null;
        String s2 = "ABC";
       // boolean a = s1.equals(s2);//NullPointerException null是不能调用方法的，就会抛出空指针异常

        /*
        Objects类的equals方法：对两个对象进行比较，防止空指针异常
        public static boolean equals(Object a,Object b){
        return (a == b) || (a != null && o.equals(b));
        }
         */
        boolean b = Objects.equals(s1,s2);
        System.out.println(b);
    }
}
