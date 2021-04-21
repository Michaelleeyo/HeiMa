package day09.demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member memberA = new Member("群员A",0);
        Member memberB = new Member("群员B",0);
        Member memberC = new Member("群员C",0);

        manager.show();
        memberA.show();
        memberB.show();
        memberC.show();
        System.out.println("======================");

        //群主总共发20元，分为3个红包
        ArrayList<Integer> redList = manager.send(20,3);
        //三个普通成员收红包
        memberA.receive(redList);
        memberB.receive(redList);
        memberC.receive(redList);

        manager.show();
        memberA.show();
        memberB.show();
        memberC.show();
    }
}
