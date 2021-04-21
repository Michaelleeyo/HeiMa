package day13.demo02;
/*
java.util.Iterator接口：迭代器（对集合进行遍历）
迭代器常用方法：
1.boolean hasNext() 如果仍有元素可以迭代，返回true
2.E next() 返回迭代的下一个元素
Iterator是一个集合，无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
Collection接口中有一个方法，叫iterator()，这个方法返回的就是迭代器的实现类对象
Iterator<E> iterator()：返回在此collection的元素上进行迭代的迭代器

使用步骤【重点】：
1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接受（多态）
2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Demo01Iterator {
    public static void main(String[] args) {

    }
}
