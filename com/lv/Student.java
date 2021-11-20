package com.lv;

public abstract class Student {

    //学号
    private String sNo;
    //姓名
    private String sName;
    //班级状态
    private boolean classStatus;

    public Student() {

    }

    public Student(String sNo, String sName, boolean classStatus) {
        this.sNo = sNo;
        this.sName = sName;
        this.classStatus = classStatus;
    }

    //注册
    public abstract void register();

    //注销
    public abstract void loginOut();



    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public boolean isClassStatus() {
        return classStatus;
    }

    public void setClassStatus(boolean classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo='" + sNo + '\'' +
                ", sName='" + sName + '\'' +
                ", classStatus=" + classStatus +
                '}';
    }
}
