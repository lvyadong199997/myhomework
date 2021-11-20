package com.lv;

public class AcademyStudent extends Student {

    public AcademyStudent(String sNo, String sName, boolean classStatus) {
        super(sNo, sName, classStatus);
    }

    @Override
    public void register() {
        System.out.println(this.getsName() + "\t注册了");
    }

    @Override
    public void loginOut() {
        System.out.println(this.getsName() + "\t注销了");
    }
}
