package chap_06;

import java.util.ArrayList;
import java.util.HashMap;

public class _quiz09 {
    public static void main(String[] args) {
        ArrayList<Student> lists = new ArrayList<>();
        Student li1 = new Student("유재호", "자바");
        Student li2 = new Student("김인경", "C++");
        Student li3 = new Student("손연경", "자바");
        Student li4 = new Student("이지영", "파이썬");

        lists.add(li1);
        lists.add(li2);
        lists.add(li3);
        lists.add(li4);

        for (Student s:lists
             ) {
            if(s.certify.contains("자바")){
                System.out.println(s.name);
            }
        }

    }
}


class Student {
    public String name;
    public String certify;

    public Student(String name, String certify) {
        this.name = name;
        this.certify = certify;
    }

    public String getCertify() {
        return certify;
    }
    public String getName() {
        return name;
    }
}