package com.lv;

//本科生
public class UndergraduateStudent extends Student {


    public UndergraduateStudent(String sNo, String sName, boolean classStatus) {
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
