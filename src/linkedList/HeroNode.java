package linkedList;


public class HeroNode {
    public int no;
    public String name;
    public String nickName;
    public HeroNode heroNode;

    public HeroNode(Integer no, String name, String nickName){
        this.no = no;
        this.name = name;
        this.nickName = nickName;

    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", heroNode=" + heroNode +
                '}';
    }

}
