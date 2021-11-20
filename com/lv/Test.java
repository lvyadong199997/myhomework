package com.lv;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {


        StudentManager studentManager = new StudentManager();
        System.out.println("*************************************学生管理系统****************************");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请选择操作(1.注册一个学生,2.注销一个学生 3,查看当前所有注册的学生 4,退出系统)");
            switch (scanner.nextInt()) {
                case 1:
                    studentManager.register();
                    break;
                case 2:
                    studentManager.loginOut();
                    break;
                case 3:
                    studentManager.printStudentInfo();
                    break;
                case 4:
                    System.out.println("成功退出系统！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("对不起，您输入的数字无效。请输入1~2之间的数字：");
            }
            System.out.println();
        }


    }

}
