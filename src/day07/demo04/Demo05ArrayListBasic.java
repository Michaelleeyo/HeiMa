package day07.demo04;

import java.util.ArrayList;
/*
如果向ArrayList当中存储基本类型，必须使用基本类型的包装类

基本类型 包装类（引用类型，包装类都在java.lang包下）
byte   Byte
short  Short
int    Integer
long   Long
float  Float
double Double
char   Character
boolean  Boolean
从JDK1.5+支持自动装箱，自动拆箱
自动装箱：基本-->包装
自动拆箱：包装-->基本
 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        //错误写法，泛型只能是引用类型，不能是基本类型
        //ArrayList<int> listB = new ArrayList<int>();

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        listB.add(300);
        System.out.println(listB);

        int num = listB.get(2);
        System.out.println("第二号元素是"+num);
    }
}
