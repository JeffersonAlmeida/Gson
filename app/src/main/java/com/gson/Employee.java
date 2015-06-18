package com.gson;

import java.util.Date;
import java.util.List;

public class Employee
{
    private Integer id;
    private String firstName;

    private Date due_date;

    private String lastName;
    private List<String> roles;
    private Department department; //Department reference

    public Employee(){
    }

    public Employee(Integer id, String firstName, String lastName, Date birthDate){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(Integer id, String firstName, Date due_date, String lastName, List<String> roles, Department department) {
        this.id = id;
        this.firstName = firstName;
        this.due_date = due_date;
        this.lastName = lastName;
        this.roles = roles;
        this.department = department;
    }

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public List<String> getRoles()
    {
        return roles;
    }
    public void setRoles(List<String> roles)
    {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", due_date=" + due_date +
                ", lastName='" + lastName + '\'' +
                ", roles=" + roles +
                ", department=" + department +
                '}';
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
