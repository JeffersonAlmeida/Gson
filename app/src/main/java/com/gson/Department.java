package com.gson;

public class Department
{
    public Department(){ super(); }

    public Department(String deptName)
    {
        this.deptName = deptName;
    }

    private String deptName;

    public String getDeptName()
    {
        return deptName;
    }

    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    @Override
    public String toString()
    {
        return "Department [deptName="+deptName+"]";
    }
}