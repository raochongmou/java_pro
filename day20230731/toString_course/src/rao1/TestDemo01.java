package rao1;

import java.util.Objects;

public class TestDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student("饶从谋", 112);
        Student s2 = new Student("饶从谋", 110);
        System.out.println(s1.equals(s2));
    }
}

class Student {
    String name;
    int id;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Student)) return false;
        Student student = (Student) o;
        return this.id == student.id && this.name.equals(student.name);
    }
}
