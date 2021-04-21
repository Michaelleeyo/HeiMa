package day11.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

        //设置英雄技能
        //使用单独定义的实现类
        /*hero.setSkill(new SkillImpl());
        hero.attack();*/

        //使用匿名内部类
        /*Skill skill = new Skill() {
            @Override
            public void release() {
                System.out.println("biu~biu~biu");
            }
        };
        hero.setSkill(skill);
        hero.attack();*/

        //同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void release() {
                System.out.println("biu~biu~biu");
            }
        });

        hero.attack();
    }
}
