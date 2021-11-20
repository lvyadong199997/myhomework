package com.lv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    List<Student> students = new ArrayList<>();

    //注册
    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号,姓名,班级状态(1表示当前班级状态很好,0表示不好),是否是本科生(1表示是,0表示不是) 请使用逗号分隔");
        String s = scanner.nextLine();
        String[] strings = s.split(",");
        if (strings[3].equals("1")) {
            //本科生
            students.add(new UndergraduateStudent(strings[0], strings[1], Boolean.parseBoolean(strings[2])));
        } else {
            //专科生
            students.add(new AcademyStudent(strings[0], strings[1], Boolean.parseBoolean(strings[2])));
        }
    }

    //退出
    public void loginOut() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入要注销的学号");
        String sno = scanner.nextLine();

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getsNo().equals(sno)) {
                iterator.remove();
                System.out.println("删除成功");
            }
        }
    }

    public void printStudentInfo() {
        if (students.size() == 0) {
            System.out.println("当前无已经注册的学生");
        }
        for (Student student : students) {
            if (student instanceof UndergraduateStudent) {
                System.out.print("本科生\t");
            } else {
                System.out.print("专科生\t");
            }
            System.out.println(student);
        }
    }
}
