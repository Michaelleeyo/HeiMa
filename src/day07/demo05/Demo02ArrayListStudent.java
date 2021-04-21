package day07.demo05;

import java.util.ArrayList;

/*
题目
自定义四个学生对象，添加到集合，并遍历
思路：
自定义Student类，四个部分
创建集合，来存储学生对象，泛型<Student>
将这4个学生对象添加到集合中：add
遍历集合：for,size,get
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("赵", 12);
        Student two = new Student("钱", 16);
        Student three = new Student("孙", 13);
        Student four = new Student("李", 14);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名："+stu.getName()+",年龄"+stu.getAge());
        }
    }
}
