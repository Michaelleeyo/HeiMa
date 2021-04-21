package day07.demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        //遍历集合
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
