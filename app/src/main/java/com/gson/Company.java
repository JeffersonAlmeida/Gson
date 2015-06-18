package com.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jefferson on 18/06/15.
 */
public class Company {


    private List<Employee> company;

    public Company(List<Employee> company) {
        this.company = company;
    }

    public Company() {

    }


    public List<Employee> getCompany() {
        return company;
    }

    public void setCompany(List<Employee> company) {
        this.company = company;
    }
}
