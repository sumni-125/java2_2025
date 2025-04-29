package day3Prac.오후실습.박예린_실습;

import java.util.*;
import java.util.stream.*;

class Customer {
    private int id;
    private String name;
    private String grade;
    private int point;

    public Customer(int id, String name, String grade, int point) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    public String getGrade() {
        return grade;
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", grade=" + grade + ", point=" + point + "]";
    }
}