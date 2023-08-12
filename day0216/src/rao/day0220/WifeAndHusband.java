package rao.day0220;

public class WifeAndHusband {
    public static void main(String[] args) {
        Husband husband = new Husband();
        husband.name = "成飞";
        Wife wife = new Wife();
        wife.name = "王小虎";
        husband.w = wife;
        wife.h = husband;
        System.out.println(husband.name + "的妻子是" + husband.w.name);
    }
}
