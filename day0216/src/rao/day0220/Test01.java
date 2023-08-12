package rao.day0220;

public class Test01 {
    public static void main(String[] args) {
        Caculator caculator = new Caculator();
        caculator.brand = "华为";
        caculator.model = "荣耀50";
        caculator.color = "白色";
        Student student = new Student();
        student.stuNo = 111;
        student.name = "小王";
        student.c = caculator;
        System.out.println(student.name + "有一台" + student.c.color + student.c.brand + student.c.model + "笔记本");
        Caculator caculator1 = new Caculator();
        //空指针异常 java.lang.NullPointerException
        caculator1 = null;
        //student.c = caculator1;
        //System.out.println(student.name + "有一台" + student.c.color + student.c.brand + student.c.model + "笔记本");
        //caculator1.brand = null;
        System.out.println(caculator1.brand);
    }
}

class Caculator {
    String brand;
    String model;
    String color;
}

class Student {
    int stuNo;
    String name;
    Caculator c;
}
